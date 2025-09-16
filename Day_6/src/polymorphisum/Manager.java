package polymorphisum;

public class Manager extends Employee {
	private double extra;

	public Manager(int empid, String empname, double salary) {
		super(empid, empname, salary);
		extra=400;
	}
	
	public void calculateSalary(){
		super.calculateSalary();
		gross=gross+extra;
	}

	@Override
	public String toString() {
		return "Manager [extra=" + extra + "]";
	}

	
	

}
