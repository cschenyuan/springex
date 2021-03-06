package chenyuan.alibaba.sentinel.cloud;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenyuan
 */
@RestController
@RequestMapping("/")
public class HelloController {

    @SentinelResource(value = "hello", blockHandler = "blockHandler")
    @GetMapping("/say")
    public String hello() {
        return "hello, sentinel";
    }

    public String blockHandler(BlockException e) {
        return "被限流了";
    }

}
