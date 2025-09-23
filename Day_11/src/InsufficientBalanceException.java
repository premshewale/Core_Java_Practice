
public class InsufficientBalanceException extends Account {
	String msg;
	public InsufficientBalanceException(String m) {
		
		msg=m;
		// TODO Auto-generated constructor stub
	}
	
		public String getMessage(){
	// TODO Auto-generated method stub
	 return msg;
}
}
