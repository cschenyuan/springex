package chenyuan.spring.core;

import chenyuan.spring.core.beans.Player;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by chenyuan on 2018/11/3.
 */
public class App {

    public static void main(String[] args) throws Exception {
//        getBeanViaApplicationContext();
        getBeanViaAnnotationApplicationContext();
    }

    private static void getBeanViaApplicationContext() throws Exception {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("app-context.xml");

        Player player1 = context.getBean(Player.class);
        player1.play();
    }

    private static void getBeanViaBeanFactory() throws Exception {
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("app-context.xml"));

        Player player = bf.getBean(Player.class);
        player.play();
    }

    private static void getBeanViaAnnotationApplicationContext() throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AutowireConfig.class);
        context.refresh();

//        Player player1 = context.getBean(Player.class);
        Player player1 = context.getBean("player", Player.class);
        System.out.println("player: " + player1);
        Player player2 = context.getBean("anotherPlayer", Player.class);
        System.out.println("player: " + player2);
//        Player player3 = context.getBean(Player.class);
//        System.out.println("player: " + player2);
    }
}
