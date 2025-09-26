
public class ThreadRunnable implements Runnable {
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<5;i++){
			System.out.print(Thread.currentThread().getName());
			System.out.println("- helloo");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){}
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Runnable tr = new ThreadRunnable();
		Thread t1 = new Thread(tr);
		Thread t2 = new Thread(tr);
		t1.setName("ping");
		t2.setName("pong");
		t1.start();
		t1.join(); // for joining threads t1 thread execut first then second
		t2.start();
	}

}
