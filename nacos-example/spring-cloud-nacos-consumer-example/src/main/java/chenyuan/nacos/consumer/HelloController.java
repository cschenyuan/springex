package chenyuan.nacos.consumer;

import chenyuan.dubbo.example.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenyuan
 */
@RestController
@RequestMapping("/")
public class HelloController {

    @Reference
    private HelloService helloService;

    @GetMapping("/say")
    public String sayHello() {
        return helloService.sayHello("Nacos");
    }

}
