
public class Mydate {
private int day,month,year;
public Mydate(){
	day=12;
	month=10;
	year=2022;
}
public Mydate(int day,int month,int year){
	this.day=day;
	this.month=month;
	this.year=year;
}
public String toString(){
	return day+"/"+month+"/"+year;
}
}
