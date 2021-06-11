package class01.class01;

public class AutoLoanCalculator implements LoanCalculator {

	public double getLoanInterest() {
		// TODO Auto-generated method stub
		return 7.5;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getClass().getName();
	}

}
