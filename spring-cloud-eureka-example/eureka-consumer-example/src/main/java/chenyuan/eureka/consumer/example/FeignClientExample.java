package chenyuan.eureka.consumer.example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenyuan
 */
// 要调用服务的名称：Provider的spring.application.name属性值
@FeignClient("eureka-provider-example")
public interface FeignClientExample {

    /**
     * 要调用的Provider中定义的接口
     */
    @RequestMapping("/test")
    public String test();
}
