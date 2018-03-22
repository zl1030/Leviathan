package com.zl1030.leviathan.data.service;

import com.zl1030.leviathan.data.model.User;

/**
 * @Author: zl1030
 * @Date: 2018/3/22 15:15
 */

public interface UserService {
    User findByName(String name);

    void save(User user);
}
