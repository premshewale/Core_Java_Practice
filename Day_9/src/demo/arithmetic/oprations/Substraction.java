package demo.arithmetic.oprations;

public class Substraction {
	private int num1,num2,ans;

	public Substraction(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		
	}
	public void sub(){
		ans=num1-num2;
	}
	@Override
	public String toString() {
		return "Substraction [ans=" + ans + "]";
	}

}
