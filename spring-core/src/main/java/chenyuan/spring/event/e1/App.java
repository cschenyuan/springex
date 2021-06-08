package chenyuan.spring.event.e1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author chenyuan
 */
public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        EmailService emailService = context.getBean(EmailService.class);
        emailService.sendEmail("a@M.com", "blocking...");
    }
}
