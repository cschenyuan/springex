package chenyuan.spring.factory.factorybean.e1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenyuan
 */
@Configuration
public class Config {

    @Bean
    public GameFactoryBean WoW() {
        return new GameFactoryBean("War of Warcraft");
    }

    @Bean
    public GameFactoryBean StarCraftII() {
        return new GameFactoryBean("Star Craft");
    }

    @Bean
    public Game LoL() {
        return new NamedGame("LoL");
    }

    @Bean
    public Game DragonNest() {
        return new NamedGame("Dragon Nest");
    }
}
