import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class ThrowS_Exception {

	
	public void readFile() throws FileNotFoundException{
		FileInputStream fs=new FileInputStream("student.txt");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThrowS_Exception ex= new ThrowS_Exception();
		try{
			ex.readFile();
		}
		catch(FileNotFoundException e){
			System.out.println("File not Found");
		}
	}

}
