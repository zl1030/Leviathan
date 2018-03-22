package com.zl1030.leviathan.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import javax.annotation.PreDestroy;

/**
 * @Author: zl1030
 * @Date: 2018/3/22 11:38
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DataCenterApplication {
    Logger logger = LoggerFactory.getLogger(DataCenterApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DataCenterApplication.class, args);
    }

    @PreDestroy
    public void shutdown() {
        logger.info("Shutdown!!!");
    }
}
