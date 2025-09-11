
public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account md=new Account();
		
		int n1=14;
		md.setaccNo(n1);
		int accNo=md.getaccNo();
		System.out.println("Account No:"+accNo);
		
		
		String na="prem";
		md.setownerName(na);
		String ownerName=md.getownerName();
		System.out.println("Name:"+ownerName);
		
		double b=1000000;
		md.setbalance(b);
		double balance=md.getbalance();
		System.out.print("Balance:"+balance);
		
	
	}
	

}
