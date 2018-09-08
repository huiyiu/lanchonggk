package com.lanchong.home.mapper;

import com.lanchong.common.MyMapper;
import com.lanchong.home.entity.Favorite;
import org.apache.ibatis.annotations.Param;

public interface FavoriteMapper extends MyMapper<Favorite> {
    void deleteByUidAndIdAndIdType(@Param("uid") Integer uid, @Param("tid") int tid, @Param("idtype") String idtype);
}
