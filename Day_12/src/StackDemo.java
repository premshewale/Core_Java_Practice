import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> numstack =  new Stack<>();
		
		numstack.push(10);
		numstack.push(15);
		numstack.push(24);
		numstack.push(12);
		numstack.push(22);
		
		System.out.println(numstack+"\n");
		System.out.println("Top of Stack : "+numstack.peek());
		System.out.println("Element removed : "+numstack.pop() );
		System.out.println(numstack);
		
		Collections.sort(numstack);
		System.out.println("Sorted Stack :"+numstack);
	}

}
