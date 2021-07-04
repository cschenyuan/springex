package chenyuan.spring.boot.acuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Actuator Example
 * <br>
 * See More: <a href="https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html#actuator">Spring Boot Actuator</a>
 * @author chenyuan
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        System.getProperties().setProperty("management.endpoint.beans.enabled", "true");
        System.getProperties().setProperty("management.endpoint.info.enabled", "true");
        System.getProperties().setProperty("management.endpoints.web.exposure.include", "*");


        SpringApplication.run(App.class, args);
    }
}
