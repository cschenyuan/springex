package chenyuan.spring.mvc.servlet.e1.impl;

import chenyuan.spring.mvc.servlet.e1.SimpleService;

/**
 * @author chenyuan
 */
public class SimpleServiceImpl2 implements SimpleService {

    @Override
    public void hello() {
        System.out.println("Service impl2");
    }
}
