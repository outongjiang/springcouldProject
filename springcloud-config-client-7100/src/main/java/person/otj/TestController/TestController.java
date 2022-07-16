package person.otj.TestController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${myname}")
    private String myname;
    @Value("${server.port}")
    private String port;
    @GetMapping("/getmyname")
    public String getmyname(){
        return "myname : "+myname+"\t\t\t\n\n"+"server.port : "+port;
    }
}
