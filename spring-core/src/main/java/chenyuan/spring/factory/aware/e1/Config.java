package chenyuan.spring.factory.aware.e1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenyuan
 */
@Configuration
public class Config {

    @Bean
    public TestBean testBean() {
        return new TestBean();
    }

}
