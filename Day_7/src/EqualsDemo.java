
public class EqualsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addition a1=new Addition(10,20);
		Addition a2=new Addition(1,2);
		Addition a3;
		a3=a1;
		
		String s1="Seed";
		String s2="Seed";
		
		Boolean ans0 =s1.equals(s2);
		System.out.println(ans0);
		
		Boolean ans =a1.equals(a3);
		System.out.println(ans);
		
		Boolean ans1 =a1.equals(a2);
		System.out.println(ans1);
		
		
	}

}
