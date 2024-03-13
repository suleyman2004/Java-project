
public class TestCompanyHierarchy {
	public static void main(String[] args) {
		System.out.println("Futuretech company");
		Person person1=new Person("Somyai","Yodyium",15,4,1987);
		person1.printInfo();
		System.out.println("----------------");
		Person person2=new Person("Pidak","Raksa",1,8,1980);
		person2.printInfo();
		System.out.println("----------------");
		System.out.println("Employee information");
		Employee employee1=new Employee("Maneeya","Rinrom",15,4,1987,"FutureTech Co.","Secretary",15000);
		employee1.printInfo();
		System.out.println("Executive information");
		Executive executive1=new Executive("Preecha","Yanusit",30,4,1977,"FutureTech Co.","Sale manager",40000,80000);
		executive1.printInfo();
		System.out.println("----------------");
		System.out.println("Rule Announcement");
		executive1.announceRule("No nap during working hours");
		System.out.println("----------------");
		employee1.followRule("No nap during working hours");
		System.out.println("----------------");
		System.out.println("Ceo information");
		CEO ceo1=new CEO("Sipol","Tongyai",19,9,1956,"FutureTech Co.","President",1500000,500000,"BMW A5");
		ceo1.printInfo();
		System.out.println("----------------");
		System.out.println("Ceo vision");
		ceo1.showVision("becoming ISO standard");
		System.out.println("----------------");
		System.out.println("Number of Person");
		person1.printNumberOfPerson();
	}

}
