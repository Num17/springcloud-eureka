package com.kayakwise.eurekaservernode3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerNode3Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerNode3Application.class, args);
    }
}
