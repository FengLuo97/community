package com.fengluo.community.dao;

import com.fengluo.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    // 分页查询
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    int selectDiscussPostsRows(@Param("userId") int userId);

}