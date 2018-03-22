package com.zl1030.leviathan.data.dao;

import com.zl1030.leviathan.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


/**
 * @Author: zl1030
 * @Date: 2018/3/22 15:15
 */
public interface UserDao extends JpaRepository<User, Long> {

    User findByName(String name);

    User findByNameAndAge(String name, Integer age);

    @Query("from User u where u.name=:name")
    User findUser(@Param("name") String name);

    @Query("from User u where u.age>=:age")
    List<User> findUser(@Param("age") int age);
}
