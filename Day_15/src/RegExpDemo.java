import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegExpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern p = Pattern.compile("abc");
		Matcher m =p.matcher("aab cd aabc aabc%s 23s abbc *345 abc");
		
		if(m.find()){
			System.out.println("String is present ");
		}else{
			System.out.println("String is not present");
		}
	}

}
