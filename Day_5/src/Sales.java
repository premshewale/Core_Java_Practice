
public class Sales extends Employees {
	
	private double incentive,gross;
	public Sales(int empid,String empname,double salary){
		super();
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
}
	public void calculateIncentive(){
		incentive=(salary*7)/100;
		gross=salary*incentive;
	}
	@Override
	public String toString() {
		return "gross Salary=" + gross  ;
	}
	
}