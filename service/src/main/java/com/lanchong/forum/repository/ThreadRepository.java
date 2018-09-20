package com.lanchong.forum.repository;

import com.lanchong.forum.entity.Thread0;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Book 数据持久层操作接口
 *
 * Created by bysocket on 09/10/2017.
 */
@Repository
public interface ThreadRepository extends PagingAndSortingRepository<Thread0,Integer> {
    Thread0 findByTid(Integer tid);

    Page<Thread0> findByAuthorid(Integer authorid,Pageable dateline);
}