import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;

@HandlesTypes( Filter.class )
public class CustomServletContainerInitializer implements ServletContainerInitializer {

	@Override
	public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
		for ( Class<?> type : c ) {
			System.out.println( type.getName() );
		}
	}

}
