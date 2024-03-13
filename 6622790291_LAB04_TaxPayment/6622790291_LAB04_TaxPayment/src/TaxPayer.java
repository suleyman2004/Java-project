//define TaxPayer to be an interface

interface TaxPayer {
   //add abstract methods to this interface
	abstract double calculateYearlyIncome( );
	abstract double calculateTax( );
	abstract void payTax( );
}