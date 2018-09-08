package com.lanchong.home.repository;

import com.lanchong.home.entity.Favorite;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Book 数据持久层操作接口
 *
 * Created by bysocket on 09/10/2017.
 */
@Repository
public interface FavoriteRepository extends PagingAndSortingRepository<Favorite,Long> {
    Page<Favorite> findByUidAndAndIdtype(Integer uid, String idtype,Pageable pageable);

}