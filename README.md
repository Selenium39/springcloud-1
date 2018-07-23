                           服务治理:Spring Cloud Eureka
                           客户端负载均衡:Spring Cloud Ribbon
```
1.搭建服务注册中心(eureka-server)
  1.@EnableEurekaServer：开启服务注册中心
  2.在配置文件中设置属性
2.注册服务提供者(eureka-service)
  1.@EnableDiscoveryClient 激活DiscoverClient实现
  2.在配置文件中设置属性
3.高可用注册中心(eureka-server-1,eureka-server-2):前面搭建的服务注册中心是单节点的服务注册中心,这在生产环境中是不合适的,Eureka Server
　　　　　　　　　的高可用是指搭建多个服务注册中心并相互注册,此次搭建了２个注册中心(eureka-server-1,eureka-server-2)
               ,他们之间相互注册,并且讲(eureka-service)都注册在了这两个注册中心
  1.同上搭建两个服务注册中心，并相互注册
  2.讲(eureka-service)的配置文件中的url增加新配置的服务注册中心,由','分隔,修改hosts文件,增加wantao,wantao1
4.服务发现与消费
  1.服务的发现是通过eureka client完成的(@EnableDiscoveryClient),消费是通过ribbon(基于http和tcp的客户端福彩均衡器)
  2.@Bean RestTemplate,@LoadBalance 负载均衡
  3.return restTemplate.getForEntity("http://HELLO-SERVICE/hello",String.class).getBody();访问的地址是服务名而不是具体框架

基础架构:
  1.服务提供者:服务注册,服务同步,服务预约
  2.服务消费者:获取服务,服务调用,服务下线
  3,服务注册中心:失效剔除,自我保护
  ```
 参考书籍<<Spring Cloud 微服务实战>>
