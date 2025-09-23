
public class MethodOuter {
	
	private int a=10;
	public void display(){
		final int b=20;
		System.out.println("In display before inner class");
		class Inner{
			public void test(){
				System.out.println("Test inner class");
				System.out.println(a);
				System.out.println(b);
			}
		}
		Inner in=new Inner();
		in.test();
	}
}
