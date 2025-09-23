
public class MyApp {

	public void myMethod()throws UserDefineException{
	 int num1=5,num2=2,ans;
		ans=num1+num2;
		if(ans<10){
			throw new UserDefineException("Answer shoud be Greater Than 10\n");
		}
		System.out.println("Addition = "+ans);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			MyApp ma=new MyApp();
			try{
				ma.myMethod();
			}
			catch(UserDefineException e){
				System.err.println(e.getMessage());
			}
			

	}
}
