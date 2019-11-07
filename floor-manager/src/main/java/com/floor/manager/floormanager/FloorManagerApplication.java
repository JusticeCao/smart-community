package com.floor.manager.floormanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@MapperScan("com.floor.manager.floormanager.mapper")
public class FloorManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FloorManagerApplication.class, args);
    }

}
