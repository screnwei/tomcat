import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AnnotationListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println( "=======================" + sce.getSource() );
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
	}

}
