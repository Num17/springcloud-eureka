package com.kayakwise.eurekaclientribbon.service.impl;

import com.kayakwise.eurekaclientribbon.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;
import java.time.Instant;

@Service
public class UserServiceImpl implements UserService {

    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "error", commandKey = "user")
    public String getInstanceMessage() {

        Instant now = Instant.now();

        String body = restTemplate.getForEntity("http://USER-SERVICE/get-user", String.class).getBody();

        logger.info("time to million:{}", Duration.between(now, Instant.now()).toMillis());

        return body;
    }

    private String error() {
        return "error";
    }

    @Qualifier("restTemplate")
    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

}
