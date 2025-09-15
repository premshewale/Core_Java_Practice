
public class StudentDetailsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyDate md=new MyDate(14,02,1998);
		
		StudentDetails sd=new StudentDetails(21, "ABC", 99.99f,md);
		System.out.println(sd);
		
		StudentDetails sd1=new StudentDetails(22, "XYZ", 99.99f,new MyDate(15,03,1999));
		System.out.println(sd1);
		
		StudentDetails sd2=new StudentDetails(23, "PQR", 99.99f,new MyDate(16,04,2000));
		System.out.println(sd2);
		
	}

}
