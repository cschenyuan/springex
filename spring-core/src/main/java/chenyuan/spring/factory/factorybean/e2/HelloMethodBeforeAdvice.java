package chenyuan.spring.factory.factorybean.e2;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author chenyuan
 */
@Component
public class HelloMethodBeforeAdvice implements MethodBeforeAdvice {

    /**
     * @param method: 被拦截的方法
     * @param objects: 被拦截方法的参数
     * @param o: 被拦截的对象
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
//        System.out.println("method: " + method.getName());
//        System.out.println("objects: " + Arrays.stream(objects));
//        System.out.println("o: " + o.getClass().getName());
        System.out.println("invoking " + method.getName() + " of " + o);
    }
}
