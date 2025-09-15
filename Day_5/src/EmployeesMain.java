

public class EmployeesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager mg1= new Manager(1001,"ABC",12000f);
		mg1.calculateSalary();
		mg1.display();
		
		
		Sales sa1=new Sales(102, "XYZ", 15000f);
		sa1.calculateIncentive();
		sa1.display();
		
		
		DailyWagesEmp dw=new DailyWagesEmp(51, "PQR", 200000f);
		dw.calculateDailySalary();
		dw.display();
		
	}

}
