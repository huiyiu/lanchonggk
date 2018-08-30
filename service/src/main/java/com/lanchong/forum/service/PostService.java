package com.lanchong.forum.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lanchong.forum.entity.Post;
import com.lanchong.forum.mapper.PostMapper;
import com.lanchong.forum.repository.PostRepository;
import com.sun.tools.javac.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.function.Function;
import java.util.stream.Collectors;


@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    @Autowired
    PostMapper postMapper;

    @Value("${attachment.forum.dir}")
    String attachmentForum;

    public Page<Post> getByUid(Integer uid, int page, int pageSize) {
        Page<Post> postPage = postRepository.findByAuthorid(uid, PageRequest.of(page,pageSize, Sort.by(Sort.Order.desc("dateline"))));
        postPage
                .filter(post->post.getAttachment() != 0)
                .map(post->{
                    post.setAttachmentUrl(attachmentForum);
                    return post;
                }
        ).stream().collect(Collectors.toList());
        return postPage;
    }

    public PageInfo<Post> getAllByUid(Integer uid, int page, int pageSize) {
        PageHelper.startPage(page,pageSize);
        return new PageInfo<Post>(postMapper.findByAuthorid(uid));
    }

}
