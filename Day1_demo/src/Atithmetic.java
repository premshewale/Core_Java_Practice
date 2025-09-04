
public class Atithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition ad ;
		ad=new Addition();
		ad.initValues(10,10);
		int ans=ad.add();
		System.out.println("Addition="+ans);
		
	
		Substraction ad1 ;
		ad1=new Substraction();
		ad1.initValues(10,10);
		int ans1=ad1.subtract();
		System.out.println("Substraction="+ans1);
		
		Multiplication ad2 ;
		ad2=new Multiplication();
		ad2.initValues(10,10);
		int ans2=ad2.multiply();
		System.out.println("Multiplication="+ans2);
		
		Division ad3 ;
		ad3=new Division();
		ad3.initValues(10,10);
		int ans3=ad3.devide();
		System.out.println("Division="+ans3);
	}

}
