package chenyuan.spring.factory.factorybean.e1;

import chenyuan.spring.core.beans.Wow;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author chenyuan
 */
public class GameFactoryBean implements FactoryBean<Game> {

    private String gameName;

    public GameFactoryBean(String gameName) {
        this.gameName = gameName;
    }

    @Override
    public Game getObject() throws Exception {
        return new NamedGame(gameName);
    }

    @Override
    public Class<?> getObjectType() {
        return Wow.class;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
