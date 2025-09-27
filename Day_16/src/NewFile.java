import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class NewFile {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			StudentDetails sd1 = new StudentDetails("ABC", 2222, 1995); 
			StudentDetails sd2 = new StudentDetails("PQR", 4444, 1993); 
			StudentDetails sd3 = new StudentDetails("LMN", 5555, 1998); 
			StudentDetails sd4 = new StudentDetails("XYZ", 1111, 1994); 
			StudentDetails sd5 = new StudentDetails("IJK", 3333, 1999); 

			FileOutputStream fout =null;
			ObjectOutputStream wobj =null;
			
		File dir = new File("D:\\StudentRecord");
		File f1 = new File(dir,"stud.txt");
		
		if(!dir.exists()){
			dir.mkdir();
			System.out.println("Directory created");
			if(!f1.exists()){
				try{
					f1.createNewFile();
				}catch(IOException e){
					
				}System.out.println("File Created");
			}
		}
		else{
			System.out.println("Folder is alredy present");}
		

			try{
				fout = new FileOutputStream(f1);
				wobj = new ObjectOutputStream(fout);
				wobj.writeObject(sd1);
				wobj.writeObject(sd2);
				wobj.writeObject(sd3);
				wobj.writeObject(sd4);
				wobj.writeObject(sd5);
				System.out.println("object is serialized");
				
			} catch(FileNotFoundException e){
				e.printStackTrace();
			}catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			finally {
				try{
					fout.close();
					wobj.close();
				}catch(IOException e){
					
				}}
			
}}

		
