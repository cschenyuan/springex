package chenyuan.eureka.consumer.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chenyuan
 */
@RestController
public class ExampleController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private FeignClientExample feignClient;

    @GetMapping("/services")
    public void printServices() {
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            System.out.println("===service = " + service);
            System.out.println("");

            List<ServiceInstance> serviceInstances = discoveryClient.getInstances(service);
            for (ServiceInstance serviceInstance : serviceInstances) {
                System.out.println("+++getInstanceId = " + serviceInstance.getInstanceId());
                System.out.println("+++getHost = " + serviceInstance.getHost());
                System.out.println("+++getPort = " + serviceInstance.getPort());
                System.out.println("+++getUri = " + serviceInstance.getUri());
                System.out.println("");
            }
            System.out.println("-------------------------------------");
        }
    }

    @GetMapping("/testFeign")
    public void testFeignClient() {
        System.out.println("Feign Client: " + feignClient.test());
    }

}
