
public class SimpleOuter {
	
	private int a=10;
	
	public void display(){
		System.out.println("In display before inner class");
	}
	
	class Inner{
		private int b;
		public void test(){
			System.out.println("Test in inner class");
			System.out.println(a);
			System.out.println(b);
		}
	}
}
