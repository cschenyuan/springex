package org.cschenyuan.spring.boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenyuan
 */
@RestController
@RequestMapping("/")
class SimpleController {

    private void printStackTrace() {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @GetMapping("/hello")
    public String hello() {
        printStackTrace();
        return "Hello!";
    }

}

