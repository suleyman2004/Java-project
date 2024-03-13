
public class FamilyMember {
	static String familyName="Hilton";
	String firstName;
	static double commonFund=100000.00;
	double privateFund;
	FamilyMember(String firstName, double privateFund){
		this.firstName=firstName;
		this.privateFund=privateFund;
	} 
	void printPrivateFund() {
		System.out.println(firstName+" "+familyName+" has "+privateFund);
	}

	void contributeToCommonFund(double amount) {
		privateFund-=amount;
		commonFund+=amount;
		
	}
    static void payfromCommonFund(double amount) {
		commonFund-=amount;
	}
    
    static void printFamilyFund() {
    	System.out.println("The "+familyName+" family has "+commonFund);
    }
	//Exercise 3-a: add two additional methods

	
	//Exercise 3-c: print the common fund of the family.

}