package polymorphisum;

public class SalesEmp extends Employee{
	private double incentive;

	public SalesEmp(int empid, String empname, double salary) {
		super(empid, empname, salary);
		// TODO Auto-generated constructor stub
	}
	public void calculateSalary(){
		super.calculateSalary();
		incentive=(salary*7)/100;
		gross=salary+incentive;
	}

	@Override
	public String toString() {
		return super.toString()+"Gross Sal "+gross;
	}
}
