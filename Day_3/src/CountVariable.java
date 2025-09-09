
public class CountVariable {
	static{
		count=0;
	}
	
	private int num1,num2,ans;
	private static int count;
	
	public CountVariable(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
		count++;
	}
	
	public void add(){
		ans=num1+num2;
		System.out.println("Addition = "+ans);
		System.out.println("Count = "+count);
	}
}
