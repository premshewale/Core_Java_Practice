
public class ExceptionThrow {
		
	private int num1=5,num2=2,ans;
	public void display(){
		ans=num1+num2;
		if(ans<10){
			throw new ArithmeticException("Answer shoud be Greater Than 10\n");
		}
		System.out.println("Addition = "+ans);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ExceptionThrow td = new ExceptionThrow();
			try{
				td.display();
			}
			catch(ArithmeticException e){
				System.err.println(e.getMessage());
			}
			System.out.println("Hello :) ");
}
	
}
