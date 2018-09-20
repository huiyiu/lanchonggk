package com.lanchong.forum.repository;

import com.lanchong.forum.entity.Post;
import com.lanchong.ucenter.entity.Members;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Book 数据持久层操作接口
 *
 * Created by bysocket on 09/10/2017.
 */
@Repository
public interface PostRepository extends PagingAndSortingRepository<Post,Long> {
    Page<Post> findByTid(Integer tid,Pageable pageable);

    Post findByPid(Integer pid);
}