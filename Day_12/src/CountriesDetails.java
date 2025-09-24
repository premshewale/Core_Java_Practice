import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class CountriesDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> countries = new ArrayList<String>();
		countries.add("India");
		countries.add("Nepal");
		countries.add("Japan");
		countries.add("America");
		countries.add("Australia");
		
		System.out.println(countries);
		
		countries.remove(3);
		
		System.out.println(countries);
		
		Iterator<String> it =countries.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		
		}
		Collections.sort(countries);
		System.out.println("Sorted Stack :"+countries);
		
	}

}
