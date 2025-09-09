
public class Evenodd {

	private int number;
	
	public Evenodd(int number){
		this.number=number;
	}
	public String checkEvenOdd(){
		if(number%2==0){
			return "Even";
		}
		else{
			return "Odd";
		}
	}
	
	public String toString(){
		return "The Number = "+number+ " is "+checkEvenOdd();
		
	}	
	
}
