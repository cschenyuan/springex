package chenyuan.dubbo.example;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author chenyuan
 */
@SpringBootApplication
public class ConsumerApplication {

    @DubboReference(url = "dubbo://localhost:20800/chenyuan.dubbo.example.HelloService")
    private HelloService helloService;

    @Bean
    public ApplicationRunner runner() {
        return args -> System.out.println(helloService.sayHello("buddy"));
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
