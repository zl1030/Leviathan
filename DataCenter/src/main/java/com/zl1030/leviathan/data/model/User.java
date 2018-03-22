package com.zl1030.leviathan.data.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @Author: zl1030
 * @Date: 2018/3/22 15:15
 */
@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 20, unique = true)
    private String name;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false)
    private Date createDate;

}
