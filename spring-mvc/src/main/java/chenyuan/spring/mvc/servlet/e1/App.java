package chenyuan.spring.mvc.servlet.e1;

import java.util.ServiceLoader;

/**
 * @author chenyuan
 */
public class App {

    public static void main(String[] args) {
        ServiceLoader<SimpleService> serviceLoader = ServiceLoader.load(SimpleService.class);

        for (SimpleService simpleService : serviceLoader) {
            simpleService.hello();
        }
    }
}
