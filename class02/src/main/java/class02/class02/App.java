package class02.class02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import class02.class02.com.entities.HomeLoanCalculator;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("appconfig.xml");
		HomeLoanCalculator obj = ctx.getBean(HomeLoanCalculator.class);
		System.out.println(obj);
		System.out.println(obj.getLoanInterest());
	}
}