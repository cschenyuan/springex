package chenyuan.spring.mvc.servlet.e1.impl;

import chenyuan.spring.mvc.servlet.e1.SimpleService;

/**
 * @author chenyuan
 */
public class SimpleServiceImpl1 implements SimpleService {

    @Override
    public void hello() {
        System.out.println("Service Impl1");
    }
}
