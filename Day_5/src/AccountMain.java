
public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyDate md=new MyDate(14,02,1998);
		
		Account ac=new Account(1000, "ABC", md);
		System.out.println(ac);
		
		Account ac1=new Account(1001, "XYZ", new MyDate(15,03,1999));
		System.out.println(ac1);
		
		Account ac2=new Account(1002, "PQR", new MyDate(16,06,2022));
		System.out.println(ac2);
	}

}
