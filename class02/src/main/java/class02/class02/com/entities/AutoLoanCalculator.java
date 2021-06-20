package class02.class02.com.entities;

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
