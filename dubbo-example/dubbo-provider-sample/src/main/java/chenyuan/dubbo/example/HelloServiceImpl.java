package chenyuan.dubbo.example;

import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author chenyuan
 */
@DubboService
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return String.format("Dubbo: hello, %s", name);
    }
}
