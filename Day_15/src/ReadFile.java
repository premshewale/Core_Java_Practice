import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fin =null;
		try{
			fin = new FileInputStream("data.txt"); //for a file read
			int data=0;
			while ((data=fin.read()) != -1){
				System.out.print((char)data);
				
			}
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
		}
		finally {
			try{
				fin.close();
			}catch(IOException e){
				
			}
			
		}
	}

}
