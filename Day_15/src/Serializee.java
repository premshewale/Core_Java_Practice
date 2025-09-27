import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee(1111, "ABC", 100000);
		
		FileOutputStream fout =null;
		ObjectOutputStream wobj =null;
				
				try{
					fout = new FileOutputStream("serial.txt");
					wobj = new ObjectOutputStream(fout);
					wobj.writeObject(emp1);
					System.out.println("emp1 object is serialized");
				} catch(FileNotFoundException e){
					e.printStackTrace();
				}catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				finally {
					try{
						wobj.close();
					}catch(IOException e){
						
					}
				}
		
	}

}
