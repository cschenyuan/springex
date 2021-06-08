package chenyuan.alibaba.sentinel.firstexample;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author chenyuan
 */
public class SomeMethod {

    public static void doSomething() {
        // register
        System.out.println("hello world " + System.currentTimeMillis());
        try (Entry entry = SphU.entry("doSomething")){
            System.out.println("hello world1 " + System.currentTimeMillis());
        } catch (BlockException e) {
            System.out.println("hello world2 " + System.currentTimeMillis());
            e.printStackTrace();
        }
    }
}
