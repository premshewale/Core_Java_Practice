
public class StringDemo {
	 
	public static void main(String[] args){
		
		String s =new String("Hello");
		String s1="Seed";
		int len =s1.length();
		System.out.println(len);
		
		
		String s2="infotech";
		String s3=s1.concat(s2);
		System.out.println(s3);
		
		StringBuffer sb1= new StringBuffer("Core");
		StringBuffer sb2=new StringBuffer("Java");
		sb1.append(sb2);
		System.out.println(sb1);
		
				
	}
}
