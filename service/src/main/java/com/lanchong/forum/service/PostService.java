package com.lanchong.forum.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lanchong.common.entity.Member;
import com.lanchong.common.repository.UsergroupRepository;
import com.lanchong.forum.entity.Attachment;
import com.lanchong.forum.entity.AttachmentN;
import com.lanchong.forum.entity.Post;
import com.lanchong.forum.entity.Thread0;
import com.lanchong.forum.mapper.AttachmentMapper;
import com.lanchong.forum.mapper.PostMapper;
import com.lanchong.forum.repository.AttachmentRepository;
import com.lanchong.forum.repository.PostRepository;
import com.lanchong.forum.repository.ThreadRepository;
import com.lanchong.home.entity.Favorite;
import com.lanchong.home.repository.FavoriteRepository;
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
    ThreadRepository threadRepository;
    @Value("${attachment.forum.dir}")
    String attachmentForum;
    @Autowired
    UsergroupRepository usergroupRepository;

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
     * @param uid
     * @param page
     * @param pageSize
     * @return
     */
    public Page<Favorite> getFavoriteByUid(Integer uid, int page, int pageSize) {
        Page<Favorite> postPage = favoriteRepository.findByUid(uid, PageRequest.of(page,pageSize, Sort.by(Sort.Order.desc("dateline"))));
        postPage
                .filter(favorite->favorite.getPost().getAttachment() != 0)
                .map(favorite->{
                    favorite.getPost().setAttachments(getAttachment(favorite.getPost().getPid()));
                            return favorite;
                        }
                ).stream().collect(Collectors.toList());
        return postPage;
    }

    /**
     * 获取帖子详情
     * @param pid
     * @return
     */
    public Post getByPid(Integer pid,Member userInfo) {

        Post post = postRepository.findByPid(pid);
        short usergroupid = userInfo.getGroupid();
        Integer realReadPerm = usergroupRepository.findByGroupid(usergroupid).getStars()*10;
        if(null != post){
            Byte readPerm = post.getThread().getReadperm();//帖子阅读权限
            //获取用户阅读权限
            if(realReadPerm < readPerm){
                Post postNo = new Post();
                BeanUtils.copyProperties(post,postNo);
                return postNo;
            }
            post.setAttachments(getAttachment(pid));
        }
        return post;
    }
}
