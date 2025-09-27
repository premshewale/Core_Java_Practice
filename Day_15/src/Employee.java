import java.io.Serializable;
public class Employee implements Serializable {

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
		return "Employee [emp_id=" + emp_id + ", " + (Name != null ? "Name=" + Name + ", " : "") + "salary=" + salary
				+ "]";
	}


	public void display(){
		System.out.println("Employee [emp_id=" + emp_id + ", " + (Name != null ? "Name=" + Name + ", " : "") + "salary=" + salary
				+ "]");
	}
}


