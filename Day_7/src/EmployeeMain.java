
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp2=new Employee(1000,"ABCD",1000);	
		
		Manager mg1=new Manager(1001,"ABC",12000);
		mg1.calculateSalary();
		System.out.println(mg1);
		mg1.displayManager();
		
		
		Employee emp=new Manager(10002,"PQR",99999);
		Manager mt=(Manager)emp;
		mt.calculateSalary();
		System.out.println(mt);
		mt.displayManager();
		
		
		Employee emp1=new Manager(1003,"XYZ",888888);
		emp1.calculateSalary();
		System.out.println(emp1);
		((Manager)emp1).displayManager();
		
		System.out.println(mg1 instanceof Employee);
		System.out.println(mg1 instanceof Manager);
		System.out.println(emp instanceof Manager);
		System.out.println(emp1 instanceof Manager);
		System.out.println(emp2 instanceof Manager);


	}
	

}
