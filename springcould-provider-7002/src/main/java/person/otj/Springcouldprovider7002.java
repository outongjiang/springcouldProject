package person.otj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("person.otj.dao")
@EnableEurekaClient
public class Springcouldprovider7002 {
    public static void main(String[] args) {
        SpringApplication.run(Springcouldprovider7002.class,args);
    }
}
