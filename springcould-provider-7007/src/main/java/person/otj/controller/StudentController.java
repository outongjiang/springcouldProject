package person.otj.controller;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import person.otj.pojo.Student;
import person.otj.service.StudentService;
import java.util.List;
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/provider")
    public List<Student>provider(@RequestBody Student student){
        return studentService.selectBySname(student);
    }

    @HystrixCommand(fallbackMethod = "hystrixGet")
    @GetMapping("/info")
    public String info() throws Exception {
        return "7007端口";
    }

    public String hystrixGet(){
        return "出现错误...";
    }
}