


	public class Manager extends Employees{  //sub class//child class
		
		private double hra,da,gross;
		public Manager(int empid,String empname,double salary){
			super();
			this.empid=empid;
			this.empname=empname;
			this.salary=salary;
			
		}
		public void calculateSalary(){
			hra=(salary*8)/100;
			da=(salary*9)/100;
			gross=salary+hra+da;
		}
		@Override
		public String toString() {
			return "Gross Salary " +gross;
		}
		
		
		
	}

