
public class Address {
private int houseno,pincode;
private String colony,city;

public Address(int houseno,String colony,String city,int pincode){
	this.houseno=houseno;
	this.colony=colony;
	this.city=city;
	this.pincode=pincode;
			
	
}
public String toString(){
	return houseno+"\t"+colony+"\t"+city+"\t"+pincode;
}
}
