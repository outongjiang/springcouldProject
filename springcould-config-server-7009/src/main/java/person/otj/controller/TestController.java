package person.otj.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {
    @Value("${myname}")
    private String myname;
    @GetMapping("/getmyname")
    public String getname(){
        System.out.println("myname : "+myname);
        return "myname : "+myname;
    }
}