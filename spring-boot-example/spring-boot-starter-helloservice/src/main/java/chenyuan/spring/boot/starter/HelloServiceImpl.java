package chenyuan.spring.boot.starter;

import org.springframework.stereotype.Service;

/**
 * @author chenyuan
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello() {
        String greet = "Hello, Spring is good.1";
        System.out.println(greet);
        return greet;
    }
}
