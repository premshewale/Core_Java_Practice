
public class DaySwap {
	private int date,month,year;
	
	
	public DaySwap(int date ,int month,int year){
		this.date=date;
		this.month=month;
		this.year=year;
	}
		public String toString(){
			return date+"/"+month+"/"+year;
		}
		public static void swap(DaySwap s1,DaySwap s2){
			 int temp;
			 temp=s1.date;
			 s1.date=s2.date;
			 s2.date=temp;
			 
			 temp=s1.month;
			 s1.month=s2.month;
			 s2.month=temp;
			 
			 temp=s1.year;
			 s1.year=s2.year;
			 s2.year=temp;
			 
			/*public static void swap(DaySwap s1,DaySwap s2){
			 MyDate tempdate;        ...this will only change on stack memory not in heap memory 
			 tempdate=m1;				..	this will not change original value
			 m1=m2;
			 m2=tempdate;*/
			
		}
}
