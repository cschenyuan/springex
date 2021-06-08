package chenyuan.eureka.consumer.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author chenyuan
 */
@SpringBootApplication
// 开启feign client, 注入FeignClient
@EnableFeignClients
public class EurekaConsumerExampleApp {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerExampleApp.class, args);
    }
}



