import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWrite {
	

	public void readWrite() {
		// TODO Auto-generated method stub
		
		FileInputStream fin =null;
		FileOutputStream fout = null;
	
		try{
			fin = new FileInputStream("Content.txt"); //for a file read
			int data;
			fout = new FileOutputStream("copiedcontent.txt",true);
			while ((data=fin.read()) != -1){
				//System.out.print((char)data);
				
					//fout = new FileOutputStream("copiedcontent.txt");	
				//for(int i=0;i<(().length();i++){
			
					fout.write(data);}
		
					System.out.println("File copied succesfully");
			
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally {
				try{
					fin.close();
					fout.close();
				}catch (IOException e) {
					// TODO: handle exception
				}
			}

}
		}	
	

