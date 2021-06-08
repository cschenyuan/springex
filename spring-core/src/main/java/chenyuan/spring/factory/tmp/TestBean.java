package chenyuan.spring.factory.tmp;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author chenyuan
 */
public class TestBean {

    @Value("game.name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
