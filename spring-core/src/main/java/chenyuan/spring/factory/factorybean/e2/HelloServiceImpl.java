package chenyuan.spring.factory.factorybean.e2;

/**
 * @author chenyuan
 */
public class HelloServiceImpl implements HelloService {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void hello() {
        System.out.println("Hello " + name);
    }
}
