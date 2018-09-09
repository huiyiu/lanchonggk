package com.lanchong.forum.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lanchong.common.entity.Member;
import com.lanchong.common.repository.UsergroupFieldRepository;
import com.lanchong.common.repository.UsergroupRepository;
import com.lanchong.cons.IDType;
import com.lanchong.forum.entity.*;
import com.lanchong.forum.mapper.AttachmentMapper;
import com.lanchong.forum.mapper.PostMapper;
import com.lanchong.forum.mapper.ThreadMapper;
import com.lanchong.forum.repository.AttachmentRepository;
import com.lanchong.forum.repository.ForumRepository;
import com.lanchong.forum.repository.PostRepository;
import com.lanchong.forum.repository.ThreadRepository;
import com.lanchong.home.entity.Favorite;
import com.lanchong.home.mapper.FavoriteMapper;
import com.lanchong.home.repository.FavoriteRepository;
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

    /**
     * 我的帖子
     * @param uid
     * @param page
     * @param pageSize
     * @return
     */
    public Page<Post> getByUid(Integer uid, int page, int pageSize) {
        Page<Post> postPage = postRepository.findByAuthorid(uid, PageRequest.of(page,pageSize, Sort.by(Sort.Order.desc("dateline"))));
        postPage
                .filter(post->post.getAttachment() != 0)
                .map(post->{
                    post.setAttachments(getAttachment(post.getPid()));
                    return post;
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
                thread.setPost(postRepository.findByPid(tid));
                thread.getPost().setAttachments(getAttachment(tid));
            }
        }
        return thread;
    }

    /**
     * 获取我收藏的板块
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

    public void setFavorThread(Member userInfo, int tid) {
        Favorite favorite = new Favorite();
        favorite.setId(tid);
        favorite.setIdtype(IDType.TID);
        favorite.setTitle(threadRepository.findByTid(tid).getSubject());
        favorite.setUid(userInfo.getUid());
        favorite.setDateline(DateUtils.now());
        favoriteMapper.insertSelective(favorite);
    }

    public void unFavorThread(Member userInfo, int tid) {
        favoriteMapper.deleteByUidAndIdAndIdType(userInfo.getUid(),tid,IDType.TID);
    }

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

    public void postThread(Member userInfo, Integer fid, String subject, String message, Integer readaccess, Short price) {

        Thread0 thread = new Thread0();
        thread.setAuthor(userInfo.getUsername());
        thread.setAuthorid(userInfo.getUid());
        thread.setDateline(DateUtils.now());
        thread.setFid(fid);
        thread.setPrice(price);
        thread.setSubject(subject);
        thread.setReadperm(readaccess);
        threadMapper.insertSelective(thread);

        Thread0 thread0 = threadMapper.findMaxByUid(userInfo.getUid());
        Post post = new Post();
        post.setPid(thread0.getTid());
        BeanUtils.copyProperties(thread0,post);
        post.setMessage(message);
        postMapper.insertSelective(post);
    }
}
