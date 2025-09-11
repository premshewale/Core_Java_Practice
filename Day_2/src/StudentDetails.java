
public class StudentDetails {
private int english,maths,physics,chemistry,biology,total;
private int rollno,year;
private float percentage;
private String stdname;

public StudentDetails(String n0,int n1,int n2,int m1,int m2,int m3,int m4,int m5){
	stdname=n0;
	rollno=n1;
	year=n2;
	english=m1;
	maths=m2;
	physics=m3;
	chemistry=m4;
	biology=m5;
	

}
public void displayStudentDetails(){
	System.out.println("Name="+stdname);
	System.out.println("RollNumber="+rollno);
	System.out.println("Year="+year);
	System.out.println("Total Marks="+total);
	System.out.println("percentage="+percentage);
}

public void marksDetails(){
	total=english+maths+physics+chemistry+biology;
	percentage=total/5;
}
public void studentGrade(){
	if(percentage>=85)
		System.out.println("Garade is: A+");
		else if(percentage>=75)
			System.out.println("Garade is: A");
	
			else if(percentage>=60)
				System.out.println("Garade is: B");
	
			else if(percentage>=50)
				System.out.println("Garade is: C");
	
			else if(percentage>=35)
				System.out.println("Garade is: PASS");
	
			else
			System.out.println("Garade is: Fail");
	
	

}
}

	
	
