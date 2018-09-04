package com.lanchong.home.repository;

import com.github.pagehelper.Page;
import com.lanchong.home.entity.Friend;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FriendRepository extends PagingAndSortingRepository<Friend,Long> {
    Page<Friend> findByUid(Integer uid ,Pageable pageable);
}
