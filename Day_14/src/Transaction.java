
public class Transaction extends Thread{
	 
	private Account acc;
	private double amount;
	private int choice;
	public Transaction(Account acc, double amount, int choice) {
	
		this.acc = acc;
		this.amount = amount;
		this.choice = choice;
	}
	@Override
	public String toString() {
		return "Transaction [" + (acc != null ? "acc=" + acc + ", " : "") + "amount=" + amount + ", choice=" + choice
				+ "]";
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try{
			if(choice == 1)
				acc.deposit(amount);
			else if(choice ==2)
				acc.withdraw(amount);
			else 
				System.out.println("Invaild choice");
		}
		catch(InterruptedException e){}
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Account acc =new Account(123, "ABC", 10000);
			Thread t1= new Transaction(acc, 1000, 1);
			Thread t2= new Transaction(acc, 2000, 2);
			t1.start();
			t2.start();
	}
	
	
	
}
