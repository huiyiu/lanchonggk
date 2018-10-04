package com.lanchong.forum.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Table;
import com.lanchong.common.entity.Member;
import com.lanchong.common.repository.UsergroupFieldRepository;
import com.lanchong.common.repository.UsergroupRepository;
import com.lanchong.cons.ForumType;
import com.lanchong.cons.IDType;
import com.lanchong.forum.entity.*;
import com.lanchong.forum.mapper.*;
import com.lanchong.forum.repository.AttachmentRepository;
import com.lanchong.forum.repository.ForumRepository;
import com.lanchong.forum.repository.PostRepository;
import com.lanchong.forum.repository.ThreadRepository;
import com.lanchong.home.entity.Favorite;
import com.lanchong.home.mapper.FavoriteMapper;
import com.lanchong.home.repository.FavoriteRepository;
import com.lanchong.ucenter.service.AttachmentService;
import com.lanchong.util.DateUtils;
import com.lanchong.util.StringUtil;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


@Service
public class PostService {
    @Autowired
    PostRepository postRepository;
    @Autowired
    AttachmentRepository attachmentRepository;
    @Autowired
    AttachmentMapper attachmentMapper;
    @Autowired
    FavoriteRepository favoriteRepository;
    @Autowired
    PostMapper postMapper;
    @Autowired
    FavoriteMapper favoriteMapper;
    @Autowired
    ThreadRepository threadRepository;
    @Value("${attachment.forum.dir}")
    String attachmentForum;
    @Autowired
    UsergroupRepository usergroupRepository;
    @Autowired
    UsergroupFieldRepository usergroupFieldRepository;
    @Autowired
    ForumRepository forumRepository;
    @Autowired
    ThreadMapper threadMapper;
    @Autowired
    AttachmentService attachmentService;
    @Autowired
    PostTableidMapper postTableidMapper;
    @Autowired
    NewThreadMapper newThreadMapper;

    /**
     * 帖子回帖
     * @param tid
     * @param page
     * @param pageSize
     * @return
     */
    public Page<Post> getPostByTid(Integer tid, int page, int pageSize) {
        return postRepository.findByTidAndPidNot(tid,tid, PageRequest.of(page,pageSize, Sort.by(Sort.Order.desc("dateline"))));


    }

    /**
     * 我的帖子
     * @param uid
     * @param page
     * @param pageSize
     * @return
     */
    public Page<Thread0> getThreadByUid(Integer uid, int page, int pageSize) {
        Page<Thread0> postPage = threadRepository.findByAuthorid(uid, PageRequest.of(page,pageSize, Sort.by(Sort.Order.desc("dateline"))));
        postPage
                .filter(thread0->thread0.getAttachment() != 0)
                .map(thread0->{
                            thread0.setAttachments(getAttachment(thread0.getTid()));
                            return thread0;
                        }
                ).stream().collect(Collectors.toList());
         return postPage;
    }

    public PageInfo<Post> getAllByUid(Integer uid, int page, int pageSize) {
        PageHelper.startPage(page,pageSize);
        return new PageInfo<Post>(postMapper.findByAuthorid(uid));
    }

   /* public List<Attachment> getAttachment(Integer pid){
        return attachmentRepository.findByPid(pid);
    }*/

    /**
     * 获取帖子 附件地址
     * @param pid
     * @return
     */
   public  List<Attachment> getAttachment(Integer pid){
       return attachmentMapper.findByPid(pid)
               .stream()
               .filter(attachment -> (attachment.getAttachmentN() != null) && (!StringUtil.isEmpty(attachment.getAttachmentN().getAttachment())))
               .map(attachment -> {
                   attachment.getAttachmentN().setAttachment(attachmentForum+attachment.getAttachmentN().getAttachment());
                   return attachment;
               })
               .collect(Collectors.toList());
   }

    /**
     * 我的收藏
     * @param userInfo
     * @param page
     * @param pageSize
     * @return
     */
    public Page<Favorite> getFavoriteByUid(Member userInfo, int page, int pageSize) {
        Page<Favorite> postPage = favoriteRepository.findByUidAndAndIdtype(userInfo.getUid(), IDType.TID, PageRequest.of(page,pageSize, Sort.by(Sort.Order.desc("dateline"))));
        postPage
               // .filter(favorite->favorite.getPost().getAttachment() != 0)
                .map(favorite->{
                    favorite.setThread(getByTid(favorite.getId(),userInfo));
                            return favorite;
                        }
                ).stream().collect(Collectors.toList());
        return postPage;
    }

    /**
     * 获取帖子详情
     * @param tid
     * @return
     */
    public Thread0 getByTid(Integer tid,Member userInfo) {

        Thread0 thread = threadRepository.findByTid(tid);
        short usergroupid = userInfo.getGroupid();
        Integer realReadPerm = usergroupFieldRepository.findByGroupid(usergroupid).getReadaccess();
        if(null != thread){
            Integer readPerm = thread.getReadperm();//帖子阅读权限
            //获取用户阅读权限
            if(realReadPerm < readPerm){
                Post postNo = new Post();
                BeanUtils.copyProperties(thread,postNo);
                return thread;
            }else{
                //thread.setPost(postRepository.findByPid(tid));
                thread.setAttachments(getAttachment(tid));
            }
        }
        return thread;
    }

    /**
     * 获取我收藏的帖子
     * @param userInfo
     * @param page
     * @param pageSize
     * @return
     */
    public Page getFavorforumByUid(Member userInfo, int page, int pageSize) {
        Page<Favorite> postPage = favoriteRepository.findByUidAndAndIdtype(userInfo.getUid(), IDType.FID, PageRequest.of(page,pageSize, Sort.by(Sort.Order.desc("dateline"))));
        postPage
                .map(favorite->{
                            favorite.setForum(getForumByFid(favorite.getId()));
                            return favorite;
                        }
                ).stream().collect(Collectors.toList());
        return postPage;
    }

    public Forum getForumByFid(Integer fid){
        return forumRepository.findByFid(fid);
    }

    /**
     * 收藏帖子
     * @param userInfo
     * @param tid
     */
    public void setFavorThread(Member userInfo, int tid) {
        Favorite favorite = new Favorite();
        favorite.setId(tid);
        favorite.setIdtype(IDType.TID);
        favorite.setTitle(threadRepository.findByTid(tid).getSubject());
        favorite.setUid(userInfo.getUid());
        favorite.setDateline(DateUtils.now());
        favoriteMapper.insertSelective(favorite);
    }

    /**
     * 取消收藏帖子
     * @param userInfo
     * @param tid
     */
    public void unFavorThread(Member userInfo, int tid) {
        favoriteMapper.deleteByUidAndIdAndIdType(userInfo.getUid(),tid,IDType.TID);
    }

    /**
     * 关注板块
     * @param userInfo
     * @param fid
     */
    public void setFavorForum(Member userInfo, int fid) {
        Favorite favorite = new Favorite();
        favorite.setId(fid);
        favorite.setIdtype(IDType.FID);
        favorite.setTitle(threadRepository.findByTid(fid).getSubject());
        favorite.setUid(userInfo.getUid());
        favorite.setDateline(DateUtils.now());
        favoriteMapper.insertSelective(favorite);
    }

    public void unFavorForum(Member userInfo, int fid) {
        favoriteMapper.deleteByUidAndIdAndIdType(userInfo.getUid(),fid,IDType.FID);
    }

    /**
     * 发表帖子，带图片
     * @param userInfo
     * @param fid
     * @param subject
     * @param message
     * @param readaccess
     * @param price
     * @param table
     */
    public void postThread(Member userInfo, Integer fid, String subject, String message, Integer readaccess, Short price, Table<String,Long,String> table,Integer attach) {

        Thread0 thread = new Thread0();
        thread.setAuthor(userInfo.getUsername());
        thread.setAuthorid(userInfo.getUid());
        thread.setDateline(DateUtils.now());
        thread.setFid(fid);
        thread.setPrice(price);
        thread.setSubject(subject);
        thread.setReadperm(readaccess);
        thread.setAttachment(attach);
        threadMapper.insertSelective(thread);

        Thread0 thread0 = threadMapper.findMaxByUid(userInfo.getUid());
        Newthread newthread = new Newthread();
        newthread.setTid(thread0.getTid());
        newthread.setFid(fid);
        newthread.setDateline(DateUtils.now());
        newThreadMapper.insert(newthread);

        postTableidMapper.insert(new PostTableid());
        Integer postId = postTableidMapper.findMaxId();
        Post post = new Post();
        post.setPid(postId);
        BeanUtils.copyProperties(thread0,post);
        post.setMessage(message);
        postMapper.insertSelective(post);

        Set<Table.Cell<String,Long,String>> cellset = table.cellSet();
        for(Table.Cell<String,Long,String> temp : cellset){
            if(null != temp){
                attachmentService.uploadAttachment(userInfo.getUid(),thread0.getTid(),post.getPid(),temp.getRowKey(),0,1,"",(short)0,temp.getColumnKey().intValue(),temp.getValue());
            }
        }
    }

    /**
     * 获取板块列表（用户是否关注子板块）
     * @param uid
     * @return
     */
    public List<Forum> listForums(Integer uid){
        return forumRepository.findByTypeAndStatus(ForumType.GROUP,1)
                .stream()
                .map(forum ->{
                    //设置子板块
                    forum.setForums(forumRepository.findByFupAndTypeAndStatus(forum.getFid(), ForumType.FORUM,1)
                    .stream()
                    .map(child->{
                        //用户是否关注
                        child.setFavored(null != favoriteRepository.findByUidAndIdtypeAndId(uid,IDType.FID,child.getFid()));
                        return child;
                    }).collect(Collectors.toList()));
                    return forum;
                })
                .collect(Collectors.toList());
    }
}
