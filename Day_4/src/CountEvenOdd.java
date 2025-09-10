
public class CountEvenOdd {
	private int evencount,oddcount,n;
	private int arr[][]=new int[5][5];
	private int var[][]={{1,2,3,4,5},
							{6,7,8,9,10},
							{11,12,13,14,15},
							{16,17,18,19,20},
							{21,22,23,24,25}};
	
	
		public void display(){
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(var[i][j]+" ");
			}
			System.out.println();
		}
	}
		public void counter(){
			for(int i=0;i<5;i++){
					evencount=0;
					oddcount=0;
					n=0;
				for(int j=0;j<5;j++){
					if(var[i][j]%2==0)
						evencount++;
					
						else
							oddcount++;
					
				}
					
			System.out.print("In Even Count = "+evencount+" ");
			System.out.println("Odd Count = "+oddcount);

}
		}
}

	
