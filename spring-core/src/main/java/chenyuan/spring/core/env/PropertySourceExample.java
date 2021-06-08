package chenyuan.spring.core.env;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @author chenyuan
 */
public class PropertySourceExample {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Config.class);
        context.refresh();

        // get property via Environment
        String pKey = "game.name";
        Environment env = context.getEnvironment();
        if (env.containsProperty(pKey)) {
            System.out.println(pKey + ": " + env.getProperty(pKey));
        }

        TestBean bean = context.getBean(TestBean.class);
        System.out.println(pKey + ": " + bean.getName());
    }
}

@Configuration
@PropertySource("classpath:application.properties")
class Config {

    @Autowired
    private Environment env;

    @Bean
    public TestBean getGameName() {
        TestBean bean = new TestBean();
        bean.setName(env.getProperty("game.name"));
        return bean;
    }
}

class TestBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
