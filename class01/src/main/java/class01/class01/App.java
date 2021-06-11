package class01.class01;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		LoanCalculator calc = ObjectFactory.getInstance().getLoanCalculatorObject();
		System.out.println(calc);
		System.out.println(calc.getLoanInterest());
	}
}
