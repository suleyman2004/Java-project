//Define PartTime to be the subclass of Employee and TaxPayer
public class PartTime extends Employee implements TaxPayer {
	String workPlace;
	int numHrPerWeek;
	double hourlyRate;

	PartTime(String name, String position, String workPlace, int numHrPerWeek, double hourlyRate) { 
		// Use super to initialize name and position
		super(name,position);
		this.workPlace=workPlace;
		this.numHrPerWeek=numHrPerWeek;
		this.hourlyRate=hourlyRate;
		// assign inputs workPlace, numHrPerWeek, and hourlyRate to their corresponding
		

	}



	public void printInfo() {
		/*
		 * Print PartTime in the following format name is a position Work at work Place
		 * Yearly income is XXXXX Pay tax $XXXXX
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
		return 12*calculateMonthlyIncome();
	}

	@Override
	public double calculateTax() {
		// TODO Auto-generated method stub
		return  calculateTaxRate(calculateYearlyIncome())*calculateYearlyIncome();
	}

	@Override
	public void payTax() {
		// TODO Auto-generated method stub
		System.out.println("Pay tax $"+calculateTax());
	}

	@Override
	public double calculateMonthlyIncome() {
		// TODO Auto-generated method stub
		return numHrPerWeek*hourlyRate*4;
	}

	@Override
	public void printWorkPlace() {
		// TODO Auto-generated method stub
		System.out.println("Work at"+workPlace);
		
	}
}
