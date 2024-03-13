
public class Person {
	Name name;
	Date dateofbirth;
	static int numberPerson=0;
	public Person(String firstName,String lastName, int day,int month,int year) {
		name=new Name(firstName,lastName);
		dateofbirth=new Date(day,month,year);
		numberPerson++;
	}
	
	void printInfo() {
		System.out.println("Name: "+name.firstName+" "+name.lastName);
		System.out.println("Date: "+dateofbirth.day+"-"+dateofbirth.month+"-"+dateofbirth.year);
		printAgeYear(2024);
	}
	void printAgeYear(int year) {
		System.out.println("Age:"+(year-dateofbirth.year));
	}
	
	void printNumberOfPerson() {
		System.out.println("the total of Person is numPerson "+numberPerson);
	}
}
