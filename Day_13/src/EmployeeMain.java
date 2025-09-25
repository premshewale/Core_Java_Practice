
		import java.util.ArrayList;
		import java.util.Collections;
		import java.util.Iterator;
		
public class EmployeeMain {
			public static void main(String[] args) {
				// TODO Auto-generated method stub
					Employee e1=new Employee(3333,"ABC",10000);
					Employee e2=new Employee(2222,"XYZ",12000);
					Employee e3=new Employee(5555,"PQR",130000);
					Employee e4=new Employee(1111,"PQR",14000);
					Employee e5=new Employee(4444,"PQR",18000);
					
					ArrayList<Employee> emplist=new ArrayList<>();
					emplist.add(e1);
					emplist.add(e2);
					emplist.add(e3);
					emplist.add(e4);
					emplist.add(e5);
					System.out.println(emplist);
					
				Collections.sort(emplist);
				
				System.out.println("Sorted List\n "+emplist);					
			}
	}


