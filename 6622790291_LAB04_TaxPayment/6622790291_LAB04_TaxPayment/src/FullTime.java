//Define class full time to be a subclass of Employee and TaxPayer
public class FullTime extends Employee implements TaxPayer {
	double salary;
	String workPlace;

	FullTime(String name, String position, String workPlace, double salary) { 
		// Use super to initialize name and position
		super(name,position);
		this.workPlace=workPlace;
		this.salary=salary;
	}

	

	public void printInfo() {
		/*
		 * print the FullTime in the following format name is a position Work at
		 * workPlace Yearly income is XXXXX Pay tax $XXXXX
		 */
		super.printInfo();
		printWorkPlace();
		System.out.println("Yearly income is "+calculateYearlyIncome());
		payTax();
		System.out.println("--------------------");
	}

	@Override
	public double calculateYearlyIncome() {
		// TODO Auto-generated method stub
		return 12*salary;
	}

	@Override
	public double calculateTax() {
		// TODO Auto-generated method stub
		return calculateTaxRate(calculateYearlyIncome())*calculateYearlyIncome();
	}

	@Override
	public void payTax() {
		// TODO Auto-generated method stub
		System.out.println("Pay tax $"+calculateTax());
	}

	@Override
	public double calculateMonthlyIncome() {
		// TODO Auto-generated method stub
		return salary;
	}

	@Override
	public void printWorkPlace() {
		// TODO Auto-generated method stub
		System.out.println("Work at"+workPlace);

}
	}