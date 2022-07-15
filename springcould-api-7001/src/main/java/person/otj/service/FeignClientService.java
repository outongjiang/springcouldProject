package person.otj.service;
import feign.hystrix.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import person.otj.pojo.Student;

import java.util.List;

@FeignClient(value = "springcould-provider",fallbackFactory = MyBackFactory.class)
@Component
public interface FeignClientService {
    @GetMapping("/info")
    public String info();

    @PostMapping("/consumer")
    public List<Student> consumer(Student student);
}
