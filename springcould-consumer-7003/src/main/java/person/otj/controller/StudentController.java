package person.otj.controller;
import feign.hystrix.FallbackFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import person.otj.pojo.Student;
import person.otj.service.FeignClientService;

import javax.annotation.Resource;
import java.util.List;
@RestController
public class StudentController {

//    @Autowired
//    private RestTemplate restTemplate;

//    @Autowired
//    private DiscoveryClient discoveryClient;
//    private static final String REST_URL_PREFIX="http://springcould-provider";

    @Autowired
    private FeignClientService feignClientService;


    @PostMapping("/consumer")
    public List<Student> consumer(Student student){
//        return restTemplate.postForObject(REST_URL_PREFIX+"/provider",student,List.class);
        return feignClientService.consumer(student);
    }

    @PostMapping("/info")
    public String info(){
//        return restTemplate.getForObject(REST_URL_PREFIX+"/info",String.class);
        return feignClientService.info();
    }

//    @GetMapping("/consumer/discovery")
//    public Object discovery(){
//        List<String> services = discoveryClient.getServices();
//        System.out.println("discovery=>services:");
//        for (String s:services){
//            System.out.println(s);
//        }
//        List<ServiceInstance> instances = discoveryClient.getInstances("UNKNOWN");
//
//        for (ServiceInstance ins:instances){
//            System.out.println(
//                    "主机名:"+ins.getHost()+"\n"+
//                    "端口号:"+ins.getPort()+"\n"+
//                    "uri:"+ins.getUri()+"\n"+
//                    "服务id:"+ins.getServiceId()
//            );
//        }
//        return  this.discoveryClient;
//
//    }



}