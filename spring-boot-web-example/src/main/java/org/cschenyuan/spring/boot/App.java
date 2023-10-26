package org.cschenyuan.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author chenyuan
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(App.class);
        application.setWebApplicationType(WebApplicationType.REACTIVE);
        application.run(args);
    }

}

