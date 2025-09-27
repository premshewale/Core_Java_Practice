import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="c,sql,rwd,core java,wcd";
		
		StringTokenizer st = new StringTokenizer(s1,","); //we can give any symbol
		
		while(st.hasMoreTokens()){
			String Skill = st.nextToken();
			System.out.println(Skill);
		}
		
	}

}
