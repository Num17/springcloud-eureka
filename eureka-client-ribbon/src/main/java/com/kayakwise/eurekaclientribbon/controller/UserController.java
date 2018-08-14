package com.kayakwise.eurekaclientribbon.controller;

import com.kayakwise.eurekaclientribbon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    private UserService userService;


    @GetMapping("/get-user")
    public String getUser() {
        return userService.getInstanceMessage();
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
