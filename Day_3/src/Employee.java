
public class Employee {
		static{
			empid=100;
			totalsalary=0;
		}
		private String name;
		private double salary;
		private static int empid;
		private static double totalsalary,avgsalary;
		public Employee(String name,double salary){
			empid++;
			this.name=name;
			this.salary=salary;
		totalsalary=totalsalary+this.salary;
			
		}
		public static void averageSalary(){
		avgsalary=totalsalary/3;
		System.out.println("Average of 3 emp : "+avgsalary);
		}
		public void displayEmployeeDetails(){
			System.out.println("Emp_id : "+empid);
			System.out.println("Name : "+name);
			System.out.println("Salary : "+salary);
		}
}
