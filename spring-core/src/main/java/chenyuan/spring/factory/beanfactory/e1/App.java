package chenyuan.spring.factory.beanfactory.e1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 自定义BeanFactoryPostProcessor
 * @author chenyuan
 */
public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        context.getBean("testBean");
    }
}
