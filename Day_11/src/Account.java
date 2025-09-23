
public class Account {
	
	
		 int accNo=111;
		 String ownerName="ABCD";
		 double balance=250;
				 
		public void withdraw()throws UserDefineException{	
			if(balance<1000.00){
				throw new UserDefineException("Insufficient Balance\n");
			}
			System.out.println("You can withdraw amt"+balance);
		}		
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Account ac=new Account();
				try{
					ac.withdraw();
				}
				catch(UserDefineException e){
					System.err.println(e.getMessage());
				}
}
}

