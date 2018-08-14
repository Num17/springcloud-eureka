package com.kayakwise.eurekaclientribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

//@EnableCircuitBreaker
//@EnableDiscoveryClient
//@SpringBootApplication
@SpringCloudApplication
public class EurekaClientRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientRibbonApplication.class, args);
    }
}
