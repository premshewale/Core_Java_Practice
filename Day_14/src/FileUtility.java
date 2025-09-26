import java.io.File;
import java.io.IOException;
public class FileUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File dir = new File("MyFolder");
		File f1 = new File(dir,"demo.txt");
		
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
			System.out.println("Folder is alredy present");
		}
		
		
	}

}
