
public class Addnum {
	private int num1,num2,sum;
	
	public Addnum(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
	}
	public void calcluate(){
		sum=num1+num2;
	}
	public String toString(){
		return "Addition = "+sum;
	}
	public static void add(Addnum p1,Addnum p2){
		int a=p1.sum+p2.sum;
		System.out.println("Anaswer= "+a);
	}

}
