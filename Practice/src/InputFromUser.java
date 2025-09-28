import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s =new Scanner(System.in);
		String y;
				
		int sum= 0,num;
		int pcount=0;
		int ncount=0;
		int zcount=0;
		do{
			
			System.out.println("Enter Number For  : ");
			num=s.nextInt();
			if(num ==0){
				zcount++;
			}else if(num>0){
				pcount++;
			}else if(num<0){
				ncount++;
			}
			System.out.println("press Y to contin  n to exit5");
			y=s.next();
			
		}
		while(y != "n");
		System.out.println("End");
		System.out.println(zcount+"=Zeros");
		System.out.println(pcount+"=Postive");
		System.out.println(ncount+"=negative");
	}

}
