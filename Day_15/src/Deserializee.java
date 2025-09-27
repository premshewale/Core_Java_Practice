import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class Deserializee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fin =null;
		ObjectInputStream oin =null;
		Employee e1=null;
				
				try{
					fin = new FileInputStream("serial.txt");
					oin = new ObjectInputStream(fin);
					Object obj = oin.readObject() ;
					e1=(Employee)obj;
					System.out.println(e1);
				} catch(FileNotFoundException e){
					e.printStackTrace();
				}catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				catch(ClassNotFoundException e){
					e.printStackTrace();
				
				
					}
				
	}

}
