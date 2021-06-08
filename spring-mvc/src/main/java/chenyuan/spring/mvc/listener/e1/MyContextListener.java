package chenyuan.spring.mvc.listener.e1;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author chenyuan
 */
public class MyContextListener implements ServletContextListener {

    private ServletContext context;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        this.context = sce.getServletContext();
        context.setAttribute("XXX", "xxx");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        this.context = null;
    }
}
