package polymorphisum;

public class Employee {
	protected int empid;
	protected String empname;
	protected double salary;
	protected String division;
	protected double hra,da,gross;
	public Employee(int empid, String empname, double salary) {
		division ="pune";
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	
	}
	public void calculateSalary(){
		hra=(salary*8)/100;
		da=(salary*9)/100;
		gross=salary+hra+da;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", " + (empname != null ? "empname=" + empname + ", " : "") + "salary="
				+ salary + ", " + (division != null ? "division=" + division : "") + "]";
	}
	
	
}
