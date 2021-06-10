package chenyuan.spring.mvc.servlet.e2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenyuan
 */
@RestController
@RequestMapping("/")
public class SimpleController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome !";
    }

    @GetMapping("/hello")
    public void hello() {
        System.out.println("Hello I am working!");
    }
}
