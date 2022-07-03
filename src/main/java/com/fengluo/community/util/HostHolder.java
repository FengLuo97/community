package com.fengluo.community.util;

import com.fengluo.community.entity.User;
import org.springframework.stereotype.Component;

/**
 * @Author: fengluo
 * @Date: 2022/6/16 23:44
 */
@Component
public class HostHolder {

    // 使用 ThreadLocal
    private ThreadLocal<User> users = new ThreadLocal<>();

    public void setUsers(User user) {
        users.set(user);
    }

    public User getUsers() {
        return users.get();
    }

    public void clear() {
        users.remove();
    }
}