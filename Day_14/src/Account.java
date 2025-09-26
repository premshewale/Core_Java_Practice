public class Account {
private int accno;
private String accname;
private double balance;

	public Account(int accno, String accname, double balance) {
		super();
		this.accno = accno;
		this.accname = accname;
		this.balance = balance;
	}	
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", " + (accname != null ? "accname=" + accname + ", " : "") + "balance="
				+ balance + "]";
	}

	public synchronized void deposit(double amount)throws InterruptedException{
		// TODO Auto-generated method stub
		System.out.println("Balance before deposit = "+balance);
		Thread.sleep(1000);
		this.balance = this.balance+amount;
		System.out.println("Balance after deposit = "+balance);
		Thread.sleep(1000);
	}
	public void withdraw(double amount) throws InterruptedException {
		// TODO Auto-generated method stub
		synchronized (this) {
			System.out.println("Balance before withdraw = "+balance);
			Thread.sleep(1000);
			this.balance = this.balance-amount;
			System.out.println("Balance after withdraw = "+balance);
			Thread.sleep(1000);
	}}
		
		
		
	}

	

