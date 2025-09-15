
public class Employees { //super class
	protected int empid;
	protected String empname;
	protected double salary;
	
	protected String division;
	
	public Employees(){
		
		division="Pune";
		
	}
	
	/*public Employees(String division) {
		super();
		this.division = division;
	}*/

	public void display(){
		System.out.println("Employee id = "+empid+
				                           "\tEmployee name = "+empname+
				                           "\tsalary = "+salary+"\tDivision = "+division);
	}

}
