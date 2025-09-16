
public class ElectronicDeviceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Computer cp=new Computer("Computer", "Dell",50);
		 System.out.println(cp);
		 
		TV tv=new TV("TV","Sony",100);
		 System.out.println(tv);
		 
		 LcdTv lc =new LcdTv("LcdTv", "LG", 50);
		 System.out.println(lc);
		 LedTv le =new LedTv("LedTv", "Samsung", 50);
		 System.out.println(le);
		 
		 MobilePhone mp=new MobilePhone("Mobile", "OnePlus", 200);
		 System.out.println(mp);
	}

}
