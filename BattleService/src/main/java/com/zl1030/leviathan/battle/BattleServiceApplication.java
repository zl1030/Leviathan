package com.zl1030.leviathan.battle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: zl1030
 * @Date: 2018/3/20 15:08
 */
@EnableDiscoveryClient
@SpringBootApplication
public class BattleServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(BattleServiceApplication.class, args);


    }
}
