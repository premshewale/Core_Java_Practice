
public class StudentDetails {

	private int rollno;
	private String name;
	private float percentage;
	MyDate birthdate;
	
	public StudentDetails(int rollno,String name,float percentage,MyDate birthdate){
		this.rollno=rollno;
		this.name=name;
		this.percentage=percentage;
		this.birthdate=birthdate;
		
	}
	public String toString(){
		return rollno+"\t"+name+"\t"+percentage+"\t"+birthdate;
	}
}
