package chenyuan.spring.core;

import chenyuan.spring.core.beans.Game;
import chenyuan.spring.core.beans.NamedGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * 运行时注入bean的属性值和依赖
 * @author chenyuan
 */
@Configuration
@PropertySource("classpath:application.properties")
public class RuntimeInjectionConfig {

    @Autowired
    private Environment env;

    @Bean
    public Game game() {
        return new NamedGame(env.getProperty("game.name"));
    }

}
