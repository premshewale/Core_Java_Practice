		import java.util.ArrayList;
		import java.util.Collections;
		import java.util.Iterator;
		import java.util.Comparator;
public class EmpNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		String s1=e1.getName();
		String s2=e2.getName();
		
		return s1.compareTo(s2);  //s1>s2=+1//s2<s1=-1
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
				Employee e1=new Employee(3333,"XYZ",10000);
				Employee e2=new Employee(2222,"ABC",12000);
				Employee e3=new Employee(5555,"PQR",130000);
				Employee e4=new Employee(1111,"LMN",14000);
				Employee e5=new Employee(4444,"IJK",18000);
				
				ArrayList<Employee> emplist=new ArrayList<>();
				emplist.add(e1);
				emplist.add(e2);
				emplist.add(e3);
				emplist.add(e4);
				emplist.add(e5);
				
				EmpNameComparator ec = new EmpNameComparator();
				System.out.println(emplist);
				Collections.sort(emplist,ec);
				System.out.println(emplist);
	}

}
