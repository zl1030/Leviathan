package com.zl1030.leviathan.battle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

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
        List<ServiceInstance> list = this.discoveryClient.getInstances("game-service");
        for (Map.Entry<String, String> entry : list.get(0).getMetadata().entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
        return list;
    }
}
