
public class MyDateConstructor {
	private int day,month,year;
	
	public MyDateConstructor(){    //default constructor
		day=14;
		month=02;
		year=1998;
		
	}

	
	public MyDateConstructor(int day,int month,int year){    // Parameterized constructure
		
		this.day=day;
		this.month=month;
		this.year=year;
		
	}
	
	public void displayDate(){
		System.out.println("My BirthDate: "+day+"/"+month+"/"+year);
	}
}
