package chenyuan.eureka.provider.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenyuan
 */
@RestController
public class ProviderExampleController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/test")
    public String test() {
        return "hello!";
    }
}
