
public class varArgsAdd {
	private String name;
	public void add(int ... num){
		int sum=0;
		for(int n:num){
			sum+=n;
		}
		System.out.println("Total = "+sum);
	}
	
	public void add(String str,int ... num){
		int sum=0;
		name=str;
		for(int n:num){
			sum+=n;
		}
		System.out.println(name+":\t"+sum);
		
	}
	public void add(float a,int ... num){
		int sum=0;
		
		for(int n:num){
			sum+=n;
		}
		System.out.println(sum+a);
	}
	
}
