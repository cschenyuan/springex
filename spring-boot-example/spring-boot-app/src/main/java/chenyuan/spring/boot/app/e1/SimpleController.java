package chenyuan.spring.boot.app.e1;

import chenyuan.spring.boot.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenyuan
 */
@RestController
public class SimpleController {

    @Autowired
    private HelloService helloService;


    @GetMapping("/hello")
    public String hello() {
        return helloService.hello();
    }
}
