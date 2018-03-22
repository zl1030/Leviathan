package com.zl1030.leviathan.data.service.impl;

import com.zl1030.leviathan.data.dao.UserDao;
import com.zl1030.leviathan.data.model.User;
import com.zl1030.leviathan.data.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: zl1030
 * @Date: 2018/3/22 15:15
 */
@Service
//@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findByName(String name) {
        return userDao.findByName(name);
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }
}
