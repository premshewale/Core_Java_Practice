
public class InnerClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			StaticOuterClass out=new StaticOuterClass();
			StaticOuterClass.Inner in=new StaticOuterClass.Inner();
			out.display();
			in.show();
			StaticOuterClass.Inner.test();
			
			
			MethodOuter out1=new MethodOuter();
			out1.display();
	}

}
