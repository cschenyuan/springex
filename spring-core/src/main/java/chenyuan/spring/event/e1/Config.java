package chenyuan.spring.event.e1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @author chenyuan
 */
@Configuration
public class Config {

    @Bean
    public EmailService emailService() {
        EmailService emailService = new EmailService();
        emailService.setBlockedList(Arrays.asList("a@M.com", "b@M.com", "c@M.com"));
        return emailService;
    }

    /**
     * 创建EventListener，并向Context注册该Listener
     */
    @Bean
    public BlockedListNotifier blockedListNotifier() {
        return new BlockedListNotifier("blockedlist@example.com");
    }

    /**
     * 创建EventListener(使用注解@EventListener的方式声明的)，并向Context注册该Listener
     */
    @Bean
    public AnnotationBasedBlockedListNotifier annotationBasedBlockedListNotifier() {
        return new AnnotationBasedBlockedListNotifier("blockedlist@example.com");
    }

}
