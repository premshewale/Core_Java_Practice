
public class SearchNum {

	private int var[]={1,2,3,4,5,5,7,8,9,10};
	private int find;
	public SearchNum(int n){
		find=n;
	}
	public void Search(){
		int flag=0,count=0;
		for(int i=0;i<10;i++){
			if(var[i]==find){
				flag=1;
				count++;
				}}
		
			if(flag==1){
				System.out.println("Number"+find+" is Present in Array:"+count+"times");
				
			}
			else{
				System.out.println("Number"+find+" is Present in Array:");
			}
		}	
		}
	

