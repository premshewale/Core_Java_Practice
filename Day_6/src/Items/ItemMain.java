package Items;

public class ItemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book bk= new Book("Bikes", "shewale publication", 2012, 01, 500, "prem", 2, 3);
		System.out.println(bk);
		
		MusicCD cd= new MusicCD("ABC", "XYZ", 2015, 02, 100, "AAA", 5);
		System.out.println(cd);
		
		Software sf=new Software("linux", "linus torvald", 1991, 05, 0, 8);
		System.out.println(sf);
	}

}
