package chenyuan.spring.core.env;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Arrays;

/**
 * @author chenyuan
 */
public class EnvironmentExample {

    public static void main(String[] args) {
        ApplicationContext context = new GenericApplicationContext();

        Environment env = context.getEnvironment();

        Arrays.stream(env.getActiveProfiles()).forEach(System.out::println);
    }
}
