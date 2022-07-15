package person.otj.config;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean  {
    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

//    @Bean
//    public IRule myRule() {
//        return new RoundRobinRule();//使用随机策略
//        //return new RoundRobinRule();//使用轮询策略
//        //return new AvailabilityFilteringRule();//使用轮询策略
//        //return new RetryRule();//使用轮询策略
//    }
}
