package person.otj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableDiscoveryClient
@EnableEurekaClient
public class SpringcouldConsumer7006 {
    public static void main(String[] args) {
        SpringApplication.run(SpringcouldConsumer7006.class,args);
    }
}
