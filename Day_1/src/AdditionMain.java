
public class AdditionMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition ad ;
		ad=new Addition();
		ad.initValues(10,10);
		int ans=ad.add();
		System.out.println("Addition="+ans);
		
		
		Addition ad1=new Addition();
		ad1.initValues(20,20);
		int ans2=ad1.add();
	
			System.out.println("Addition="+ans2);
			
	
	}
	

}