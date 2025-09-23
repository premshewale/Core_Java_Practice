
public class InnerClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleOuter out =new SimpleOuter();
		out.display();
		
		SimpleOuter.Inner in=out.new Inner();
		in.test();
		
		
		
		
		SimpleOuter.Inner in2=new SimpleOuter().new Inner();
		
		in2.test();
				
	}

}
