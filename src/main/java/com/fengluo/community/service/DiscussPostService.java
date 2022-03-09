package com.fengluo.community.service;

import com.fengluo.community.dao.DiscussPostMapper;
import com.fengluo.community.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussPostService {

    @Autowired
    private DiscussPostMapper discussPostMapper;

    public List<DiscussPost> findDiscussPost(int userId, int offset, int limit) {
        return discussPostMapper.selectDiscussPosts(userId, offset, limit);
    }

    public int finDiscussPostRows(int userId) {
        return discussPostMapper.selectDiscussPostsRows(userId);
    }
}
