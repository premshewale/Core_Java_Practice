import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter some text to file");
		//System.in.
		FileOutputStream fout = null;
		String s1= "\n Core Java file stream.........";
		try{
			fout=new FileOutputStream("info.txt",true); //true--append mode to add update file
			for(int i=0;i<s1.length();i++){
				fout.write(s1.charAt(i));
			}
			System.out.println("File written succesfully");
		}catch(FileNotFoundException e){
			
		}catch (IOException e) {
			// TODO: handle exception
		}finally {
			try{
				fout.close();
			}catch (IOException e) {
				// TODO: handle exception
			}
		}
		
		
	}

}
