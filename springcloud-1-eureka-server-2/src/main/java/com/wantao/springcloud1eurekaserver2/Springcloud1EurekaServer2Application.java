package com.wantao.springcloud1eurekaserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Springcloud1EurekaServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud1EurekaServer2Application.class, args);
    }
}
