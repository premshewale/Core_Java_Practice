
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
	
	public void displayManager(){
		System.out.println("displayManager method in Manager Class");
	}

	@Override
	public String toString() {
		return super.toString()+"Gross Sal ["+gross+"]";
	}

	
	
	

}

