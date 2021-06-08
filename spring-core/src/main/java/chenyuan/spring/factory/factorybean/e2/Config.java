package chenyuan.spring.factory.factorybean.e2;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenyuan
 */
@Configuration
@ComponentScan
public class Config {

    @Bean
    public HelloService helloService() {
        HelloServiceImpl helloService = new HelloServiceImpl();
        helloService.setName("chenyuan");
        return helloService;
    }

    /**
     * 交由Spring自动创建ProxyFactoryBean实例
     */
    @Bean
    public ProxyFactoryBean myProxyBean02() {
        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        proxyFactoryBean.setInterceptorNames("helloMethodBeforeAdvice");
        proxyFactoryBean.setInterfaces(HelloService.class);
        proxyFactoryBean.setTarget(helloService());
        return proxyFactoryBean;
    }
}
