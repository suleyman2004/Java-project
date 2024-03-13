
public class Address {
	String houseNo = "-"; 
	String Soi= "-"; 
	String Road= "-"; 
	String subDistrict= "-"; 
	String district= "-"; 
	String province= "-"; 
	String postcode= "-";
	public Address(String houseNo, String Soi, String Road, String subDistrict, String
district, String province, String postcode) {
		this.houseNo=houseNo; 
		this.Soi=Soi; 
		this.Road=Road; 
		this.subDistrict=subDistrict; 
		this.district=district; 
		this.province=province; 
		this.postcode=postcode;
	}
	
	public Address( String province, String postcode) { 
					this.province=province; 
					this.postcode=postcode;
				}
	
	void printFullAddress() {
		 System.out.println(houseNo+","+Soi+","+Road+","+subDistrict+","+district+","+province+","+postcode);
	 }
	
	void printShortAddress() {
		 System.out.println(district+","+province);
	 }

}
