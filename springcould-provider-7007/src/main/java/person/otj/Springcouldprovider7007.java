package person.otj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

//加了hystrix服务熔断

@SpringBootApplication

@MapperScan("person.otj.dao")

@EnableEurekaClient

// 添加对熔断的支持注解
@EnableCircuitBreaker
public class Springcouldprovider7007 {

    public static void main(String[] args) {
        SpringApplication.run(Springcouldprovider7007.class,args);
    }

}