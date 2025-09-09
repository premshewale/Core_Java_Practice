
public class Customer {
	static{
		interesrate=1;
	}
	private String name;
	private int principleamount,time,simpleinterest;
	private static int interesrate;
	
	
	public Customer(String name,int principleamount,int time){
		this.name=name;
		this.principleamount=principleamount;
		this.time=time;
		interesrate++;
	}
	public void displayCustomerDetails(){
		System.out.println("Name = "+name);
		System.out.println("principle Amount = "+principleamount);
		System.out.println("Time = "+time);
		
		simpleinterest=principleamount*interesrate*time;
		System.out.println("Simple Interest = "+simpleinterest);
	}
	
}

