package chenyuan.alibaba.sentinel.firstexample;

import java.util.concurrent.TimeUnit;

/**
 * @author chenyuan
 */
public class Client {

    public static void main(String[] args) {
        Config.initFlowRules();

        while (true) {
            SomeMethod.doSomething();
            try {
                TimeUnit.MILLISECONDS.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
