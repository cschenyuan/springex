package chenyuan.spring.factory.factorybean.e1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author chenyuan
 */
public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(Config.class);

        for (String sn : ctx.getBeanFactory().getSingletonNames()) {
            Class type = ctx.getBean(sn).getClass();
            System.out.println("Singleton: " + sn + " => " + type.getName());
        }
    }
}
