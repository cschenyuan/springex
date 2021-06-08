package chenyuan.spring.factory.tmp;

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
