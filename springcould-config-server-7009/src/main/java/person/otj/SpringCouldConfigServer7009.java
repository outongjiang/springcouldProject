package person.otj;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@SpringBootApplication
@EnableConfigServer
public class SpringCouldConfigServer7009 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCouldConfigServer7009.class,args);
    }
}