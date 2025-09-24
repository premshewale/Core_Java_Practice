import java.util.ArrayList;
public class SimpleCollection {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Integer i1 = new Integer(155); 	//i1=10
		Integer i2 = new Integer(3);
		Integer i3 = new Integer(312);
		Float f1= new Float (12.2f);
		
		ArrayList<Integer> li1= new ArrayList<Integer>();
		li1.add(i1);
		li1.add(i2);
		li1.add(i3);
		li1.add(15);
		li1.add(66);
		//li1.add(f1);
		//li1.add("ABC");
		System.out.println(li1);
	
		
		ArrayList li2= new ArrayList();
		li2.add(i1);
		li2.add(i2);
		li2.add(i3);
		li2.add(15);
		li2.add(66);
		li2.add(f1);
		li2.add("ABC");
		System.out.println(li2);
		
	}

}
