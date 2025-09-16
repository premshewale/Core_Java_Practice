package polymorphisum;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Employee emp= new Employee(101, "AAA", 50000);
			emp.calculateSalary();
			System.out.println(emp);

			Manager mg=new Manager(102, "ABC", 50000);
			mg.calculateSalary();
			System.out.println(mg);
			
			SalesEmp se=new SalesEmp(103, "XYZ", 50000);
			se.calculateSalary();
			System.out.println(se);
			
			
	}

}
