package person.otj.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import person.otj.pojo.Student;

import java.util.List;

@Component
public class MyBackFactory implements FallbackFactory {

    @Override
    public FeignClientService create(Throwable throwable) {
        return new FeignClientService() {
            @Override
            public String info() {
                return "MyBackFactory配置下显示的错误....";
            }

            @Override
            public List<Student> consumer(Student student) {
                return null;
            }
        };
    }
}
