
public class Employee {

	 private int emp_id;
	 private String Name;
	 private double salary;
	 
	 public Employee(int emp_id,String Name,double salary){
	 this.emp_id=emp_id;
	 this.Name=Name;
	this.salary=salary;
	 
	 }


	@Override
	public String toString() {
		return + emp_id+"\t" +Name+"\t"+ salary;
	}
	 
	 

}
