package chenyuan.spring.boot.app.e1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 使用自定义的hello service starter
 * @author chenyuan
 */
@SpringBootApplication
public class App {

    private static final String ENABLE_HELLOSERVICE = "chenyuan.spring.boot.helloservice.enableautoconfiguration";

    public static void main(String[] args) {
//        System.getProperties().setProperty("spring.boot.enableautoconfiguration", "false");
        System.getProperties().setProperty(ENABLE_HELLOSERVICE, "true");
        SpringApplication app = new SpringApplication(App.class);
        app.setWebApplicationType(WebApplicationType.SERVLET);
        app.run(args);
    }
}
