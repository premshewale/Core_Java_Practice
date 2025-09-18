
public class Addition {
	private int num1,num2,sum;
	
	public Addition(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
	}
	public void calcluate(){
		sum=num1+num2;
	}
	public String toString(){
		return "Addition = "+sum;
	}
	public static void add(Addition p1,Addition p2){
		int a=p1.sum+p2.sum;
		System.out.println("Anaswer= "+a);
	}

}


