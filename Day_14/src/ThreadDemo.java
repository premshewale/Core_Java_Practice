
public class ThreadDemo	extends Thread {
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++){
			System.out.println("Hello");
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
		}
		}	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new ThreadDemo();
		Thread t2 = new ThreadDemo();
		t1.start();
		t2.start();
		
		

	}

}
