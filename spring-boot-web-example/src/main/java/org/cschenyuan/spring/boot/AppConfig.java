package org.cschenyuan.spring.boot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

/**
 * @author chenyuan
 */
@Configuration
public class AppConfig {

    @Bean("testListBean")
    public List<String> testList() {
        return Arrays.asList("a", "b");
    }
}
