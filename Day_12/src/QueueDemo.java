import java.util.PriorityQueue;
public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		pq.add(50);
		
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		System.out.println("Start = "+pq.peek()+"\n" );
		
		
		pq.poll();
		System.out.println(pq);
		System.out.println("Start = "+pq.peek() );
	}

}
