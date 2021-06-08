package chenyuan.spring.core.beans;

import chenyuan.spring.core.conditional.GameCondition;
import chenyuan.spring.core.beans.Game;
import chenyuan.spring.core.beans.Wow;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author chenyuan
 */
@Configuration
//@Conditional(GameCondition.class)
public class GameConfig {

    @Bean
    @Profile("production")
    public Game game() {
        return new Wow();
    }

    @Bean
    public GameFactoryBean wow() {
        return new GameFactoryBean("War of Warcraft");
    }

    @Bean
    public GameFactoryBean starcraft() {
        return new GameFactoryBean("Star Craft");
    }
}
