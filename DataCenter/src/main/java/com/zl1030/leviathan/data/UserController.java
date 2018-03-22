package com.zl1030.leviathan.data;

import com.zl1030.leviathan.data.model.User;
import com.zl1030.leviathan.data.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author: zl1030
 * @Date: 2018/3/22 15:19
 */
@RestController
@RefreshScope
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getuser")
    public User getuser(@RequestParam(value = "name", defaultValue = "World") String name) {
        return userService.findByName(name);
    }

    @RequestMapping("/adduser")
    public User adduser(@RequestParam(value = "name", defaultValue = "World") String name) {

        User user = new User();
        user.setName(name);
        user.setAge(36);
        user.setCreateDate(new Date());
        userService.save(user);

        return user;
    }
}
