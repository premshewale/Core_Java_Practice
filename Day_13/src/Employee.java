
public class Employee implements Comparable<Employee> {

	 private int emp_id;
	 private String Name;
	 private double salary;
	 
	 public Employee(int emp_id,String Name,double salary){
	 this.emp_id=emp_id;
	 this.Name=Name;
	this.salary=salary;
	 
	 }
	 
	 @Override
		public int compareTo(Employee e) {
			// TODO Auto-generated method stub
		 if(this.emp_id > e.emp_id)
			 return 1;
		 else if(this.emp_id < e.emp_id)
			 return -1;
		 else		 
			return 0;}
	 
public int getEmpid(){
	return emp_id;}	
public void setEmpid(int emp_id){
	this.emp_id=emp_id;}
	 	 
public String getName(){
	 return Name;}
public void getName(String Name){
	 this.Name=Name;}

public double getsalary(){
	 return salary;}
public void getName(double salary){
	 this.salary=salary;}


	@Override
	public String toString() {
		return + emp_id+"\t" +Name+"\t"+ salary;
	}


	
}

