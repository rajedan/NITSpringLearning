package class01.class01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ObjectFactory {

	private static final ObjectFactory factory = new ObjectFactory();

	private ObjectFactory() {
	}

	public static ObjectFactory getInstance() {
		return factory;
	}

	public LoanCalculator getLoanCalculatorObject() {
		LoanCalculator calculator = null;
		try {
			BufferedReader bf = new BufferedReader(new FileReader("application.properties"));
			String className = bf.readLine();
			calculator = (LoanCalculator) Class.forName(className).newInstance();
			System.out.println(calculator);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return calculator;
	}
}
