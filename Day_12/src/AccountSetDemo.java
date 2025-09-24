import java.util.HashSet;
import java.util.Iterator;
public class AccountSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a1=new Account(111, "ABC", 100000);
		Account a2=new Account(222, "XYZ", 120000);
		Account a3=new Account(333, "PQR", 150000);
		HashSet<Account> accountlist = new HashSet<>();
		accountlist.add(a1);
		accountlist.add(a2);
		accountlist.add(a3);
		
		System.out.println("Account Details : "+accountlist+"\n");
		
   Iterator<Account> i = accountlist.iterator();
		
		while (i.hasNext()) {
			System.out.println(i.next());
			
	}

}
}
