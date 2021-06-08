package chenyuan.spring.core;

import chenyuan.spring.core.beans.Player;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenyuan
 */
@Configuration
public class PlayerConfig {
    @Bean
    public Player player() {
        return new Player();
    }

    @Bean
    @Qualifier("anotherPlayer")
    public Player anotherPlayer() {
        return new Player();
    }
}
