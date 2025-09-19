package demo.arithmetic.oprations;

public class Multiplication {
	private int num1,num2,ans;

	public Multiplication(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		
	}
	public void multi(){
		ans=num1*num2;
	}
	@Override
	public String toString() {
		return "Multiplication [ans=" + ans + "]";
	}

}
