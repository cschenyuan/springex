package chenyuan.spring.factory.factorybean.e1;

/**
 * @author chenyuan
 */
public class NamedGame implements Game {

    private String name;

    public NamedGame(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return this.name;
    }
}
