
public class StaticOuterClass {
	
	private static int num=200;
	private int a;
	public void display(){
		System.out.println("In Outer Class");
	}
	
	static class Inner{
		private static int num1=100;
		public static void test(){
			System.out.println("In inner class = "+num1	);
			System.out.println("In inner class = "+num	);
		}
		public void show(){
			System.out.println("Non static inner method");
		}
	}
}
