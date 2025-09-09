
public class EmployeesMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		Employee ep=new Employee("prem", 2500000);
		ep.displayEmployeeDetails();
		Employee ep1=new Employee("kumar", 120000);
		ep1.displayEmployeeDetails();
		Employee ep2=new Employee("ABC", 150000);
		ep2.displayEmployeeDetails();
		
		Employee.averageSalary();
	}		
}
