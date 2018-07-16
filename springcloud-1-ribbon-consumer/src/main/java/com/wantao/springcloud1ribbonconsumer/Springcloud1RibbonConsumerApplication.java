package com.wantao.springcloud1ribbonconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient  //注册为Eureka Client,以获得查找服务的功能
@SpringBootApplication
public class Springcloud1RibbonConsumerApplication {
    @Bean
    @LoadBalanced  //负载均衡
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(Springcloud1RibbonConsumerApplication.class, args);
    }
}
