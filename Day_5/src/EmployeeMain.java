
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ad= new Address(1, "nagar", "pune", 420305);
		MyDate md= new MyDate(14,02,1998);
		Employee emp1=new Employee(101, "abc", 100000f, md,ad);
		System.out.println(emp1);
		
		Employee emp2=new Employee(202, "xyz", 200000,new MyDate(01,01,2000),new Address(2, "colony", "mumbai", 400023));
		System.out.println(emp2);	
		
		Employee emp3=new Employee(303, "pqr", 300000,new MyDate(02,02,2022),new Address(3, "kothrud", "pune", 500123));
		System.out.println(emp3);
	}

}
