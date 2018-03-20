package com.zl1030.leviathan.battle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: zl1030
 * @Date: 2018/3/20 15:14
 */
@RestController
public class GameServiceController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/games")
    public List<ServiceInstance> showInfo() {
        return this.discoveryClient.getInstances("game-service");
    }
}
