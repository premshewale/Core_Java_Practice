package Reflection;

public class Employee {

	public int empid;
	public String empname;
	public double salary;
	
	
	public Employee(int empid,String empname,double salary){
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
		
	}
	public String toString(){
		return empid+"\t"+empname+"\t"+salary+"\t";
	}
	
	public void display(){
		System.out.println("Display Method");
	}
	public void demo(){
		System.out.println("Demo Method");
	}
}



