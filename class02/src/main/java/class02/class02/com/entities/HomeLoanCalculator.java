package class02.class02.com.entities;

public class HomeLoanCalculator implements LoanCalculator {

	public double getLoanInterest() {
		// TODO Auto-generated method stub
		return 6.5;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getClass().getName();
	}
}
