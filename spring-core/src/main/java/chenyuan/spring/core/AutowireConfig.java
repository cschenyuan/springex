package chenyuan.spring.core;

import chenyuan.spring.core.beans.GameConfig;
import org.springframework.context.annotation.*;

/**
 * Created by chenyuan on 2018/11/3.
 */
@Configuration
@ComponentScan
@Import({GameConfig.class, PlayerConfig.class})
@ImportResource({"classpath:app-context.xml"})
public class AutowireConfig {

}
