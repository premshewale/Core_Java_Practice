import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;


public class EmployeesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Employee e1=new Employee(1001,"ABC",10000);
			Employee e2=new Employee(1002,"XYZ",12000);
			Employee e3=new Employee(1003,"PQR",15000);
			
			ArrayList<Employee> emplist=new ArrayList<>();
			emplist.add(e1);
			emplist.add(e2);
			emplist.add(e3);
			
			Iterator<Employee> it=emplist.iterator();
			
			while (it.hasNext()) {
				System.out.println(it.next());
				
			}
	}

}
