package com.wantao.eureka.service.controller;/*
 *author:wantao
 *createTime:18-7-16 10:47
 *description:
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class HelloController {
    private Logger logger=Logger.getLogger("HelloController.class");
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello",method=RequestMethod.GET)
    public String hello(){
        return "HelloWorld";
    }

}
