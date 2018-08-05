package com.kayakwise.eurekaclientribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Qualifier("restTemplate")
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get-user")
    public String getUser() {
        return restTemplate.getForEntity("http://USER-SERVICE/get-user", String.class).getBody();
    }

}
