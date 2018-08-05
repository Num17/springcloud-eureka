package com.kayakwise.eurekaclient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Value("${spring.application.name}")
    private String serviceInstance;

    @Qualifier("discoveryClient")
    @Autowired
    private DiscoveryClient discoveryClient;


    @GetMapping("/get-user")
    public Map<String, List<ServiceInstance>> getUser() {

        Map<String, List<ServiceInstance>> serviceMap = new HashMap<>();
        List<ServiceInstance> serviceInstances = discoveryClient.getInstances(serviceInstance);

        for (ServiceInstance instance : serviceInstances) {
            int port = instance.getPort();
            String host = instance.getHost();
            URI uri = instance.getUri();

            String serviceId = instance.getServiceId();

            logger.info("port: {},host:{},url:{},serviceId:{}", port, host, uri.toString(), serviceId);
        }

        serviceMap.put(serviceInstance, serviceInstances);

        return serviceMap;
    }

}
