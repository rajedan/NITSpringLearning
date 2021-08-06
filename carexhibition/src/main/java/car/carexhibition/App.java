package car.carexhibition;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CarExhibition ce = ctx.getBean("carexhibition", CarExhibition.class);
		System.out.println(ce.cars);
	}
}
