
public class AddNumMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addnum ad=new Addnum(10,10);
		Addnum ad1=new Addnum(1,2);
		
		ad.calcluate();
		ad1.calcluate();
		
		System.out.println(ad);
		System.out.println(ad1);
		
		Addnum.add(ad,ad1);
	}

}
