
public class DaySwapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DaySwap ds=new DaySwap(12, 23, 1234);
		DaySwap ds1=new DaySwap(34, 45, 5678);
		
		System.out.println("Before Swap= \t"+ds+"\t"+ds1);
		
		DaySwap.swap(ds, ds1);
		System.out.println("After Swap= \t"+ds+"\t"+ds1);
	}

}
