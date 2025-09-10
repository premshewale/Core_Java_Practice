
public class NumSwap {
	
	
	private int num;
	

	public NumSwap(int num){
		this.num=num;
		
	}
	public String toString(){
		return "number = "+num;
	}
	public static void swap(NumSwap s1,NumSwap s2){
		 int temp;
		 temp=s1.num;
		 s1.num=s2.num;
		 s2.num=temp;
		
		
	}
}
	
