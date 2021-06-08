package chenyuan.spring.factory.tmp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author chenyuan
 */
public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        TestBean bean = (TestBean) context.getBean("testBean");
        System.out.println(bean.getName());
    }
}
