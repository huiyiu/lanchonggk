package com.lanchong.forum.repository;

import com.lanchong.forum.entity.Forum;
import com.lanchong.forum.entity.Thread0;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Book 数据持久层操作接口
 *
 * Created by bysocket on 09/10/2017.
 */
@Repository
public interface ForumRepository extends PagingAndSortingRepository<Forum,Integer> {
    Forum findByFid(Integer fid);
}