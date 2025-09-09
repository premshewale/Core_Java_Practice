
public class TempConverterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TempConvertor tp=new TempConvertor(10);
		tp.converter();
		System.out.println(tp);
		
		TempConvertor tp1=new TempConvertor(0);
		tp1.converter();
		System.out.println(tp1);
		
		TempConvertor tp2=new TempConvertor(100);
		tp2.converter();
		System.out.println(tp2);
	}

}
