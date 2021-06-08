package chenyuan.spring.factory.factorybean.e2;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author chenyuan
 */
public class App {

    public static void main(String[] args) {
        String packageName = App.class.getPackage().getName();
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

//        configureManually(ctx);

        HelloService serviceProxy = (HelloService) ctx.getBean("myProxyBean");
        serviceProxy.hello();

        System.out.println("" + ctx.getBean(HelloServiceImpl.class));
        System.out.println("" + ((ProxyFactoryBean) ctx.getBean("&myProxyBean02")).getObject());
    }

    /**
     * 手动创建ProxyFactoryBean实例, 并注册
     * @param ctx
     */
    private static void configureManually(AnnotationConfigApplicationContext ctx) {
        ConfigurableBeanFactory beanFactory = ctx.getBeanFactory();
        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        proxyFactoryBean.setBeanFactory(beanFactory);
        proxyFactoryBean.setInterceptorNames("helloMethodBeforeAdvice");
        proxyFactoryBean.setInterfaces(HelloService.class);
        proxyFactoryBean.setTarget(ctx.getBean(HelloService.class));
        beanFactory.registerSingleton("myProxyBean", proxyFactoryBean);
    }
}
