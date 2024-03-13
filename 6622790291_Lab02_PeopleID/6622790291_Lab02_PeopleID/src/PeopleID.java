
public class PeopleID {
	Name name; 
	String ID; 
	Date dateOfBirth; 
	Address address;
	public PeopleID(Name name,String ID) {
		this.name=name;
		this.ID=ID;
	}
	
	public PeopleID(Name name,String ID,Date dateOfBirth,Address address) {
		this.name=name;
		this.ID=ID;
		this.dateOfBirth=dateOfBirth;
		this.address=address;
	}
	
	
	void printPeopleID() {
		name.printName();
		System.out.println(ID);
		dateOfBirth.printDate();
		address.printFullAddress();
	}
}
