package chenyuan.spring.factory.aware.e1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author chenyuan
 */
public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        context.getBean("testBean");
    }
}
