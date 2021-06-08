package chenyuan.spring.core.beans;

import org.springframework.stereotype.Component;

/**
 * Created by chenyuan on 2018/11/3.
 */
@Component
public class Wow implements Game {

    public String name() {
        return "War of WarCraft";
    }

}
