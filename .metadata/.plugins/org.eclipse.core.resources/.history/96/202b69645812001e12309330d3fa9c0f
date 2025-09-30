import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={1,2,3,4,5};
		
		FileInputStream fs= null;
		
		try{
			fs=new FileInputStream("student.txt");
			System.out.println("After file input");
		
			for(int i=0;i<=5;i++){
			
				System.out.println(arr[i]);
			}                                                                                                  
			
		
		}
		catch(FileNotFoundException e){
			System.err.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.err.println(e);
		}
		catch(Exception e){
			System.err.println(e);
		}
		finally{
			//fs.close();
		}
		
	}

}
