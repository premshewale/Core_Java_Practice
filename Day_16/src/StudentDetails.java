import java.io.Serializable;

public class StudentDetails implements Serializable{

	public String studentname;
	public int rollNo;
	public int birthyear;
	
	
	public StudentDetails(String studentname, int rollNo, int birthyear) {
	
		this.studentname = studentname;
		this.rollNo = rollNo;
		this.birthyear = birthyear;
	}


	@Override
	public String toString() {
		return "StudentDetails [" + (studentname != null ? "studentname=" + studentname + ", " : "") + "rollNo="
				+ rollNo + ", birthyear=" + birthyear + "]";
	}


	

}

