package chenyuan.spring.factory.beanfactory.e1;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenyuan
 */
@Configuration
public class Config {

    @Bean
    public TestBean testBean() {
        TestBean bean = new TestBean();
        bean.setName("chenyuan");
        return bean;
    }

    /**
     * 注册到Spring容器
     * @return
     */
    @Bean
    public static BeanFactoryPostProcessor customBeanFactoryPostProcessor() {
        return new CustomBeanFactoryPostProcessor();
    }
}
