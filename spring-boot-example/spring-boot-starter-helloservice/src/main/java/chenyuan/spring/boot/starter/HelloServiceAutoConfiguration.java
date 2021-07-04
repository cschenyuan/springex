package chenyuan.spring.boot.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenyuan
 */
@Configuration
@ComponentScan({"chenyuan.spring.boot.starter"})
@ConditionalOnProperty(
        name = "chenyuan.spring.boot.helloservice.enableautoconfiguration",
        havingValue = "true",
        matchIfMissing = true
)
public class HelloServiceAutoConfiguration {

}
