import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> skills = new HashSet<>();
		
		skills.add("C Programming");
		skills.add("SQL");
		skills.add("RWD");
		skills.add("Core Java");
		skills.add("SQL");
		
		System.out.println(skills);
		
		Iterator<String> i = skills.iterator();
		
		while (i.hasNext()) {
			System.out.println(i.next());
			
		}
		
	}

}
