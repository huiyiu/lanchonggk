package com.lanchong.home.repository;

import com.lanchong.home.entity.Follow;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Book 数据持久层操作接口
 *
 * Created by bysocket on 09/10/2017.
 */
@Repository
public interface FollowRepository extends PagingAndSortingRepository<Follow,Long> {


}