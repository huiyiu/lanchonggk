package com.lanchong.forum.repository;

import com.lanchong.forum.entity.Post;
import com.lanchong.ucenter.entity.Members;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Book 数据持久层操作接口
 *
 * Created by bysocket on 09/10/2017.
 */
@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
    List<Post> findByAuthorid(Integer authorid);
}