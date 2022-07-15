package person.otj;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication

//@EnableDiscoveryClient

@EnableEurekaClient

//开启功能feign
@EnableFeignClients(basePackages = {"person.otj.service"})

public class SpringcouldConsumer7003 {

    public static void main(String[] args) {
        SpringApplication.run(SpringcouldConsumer7003.class,args);
    }

}