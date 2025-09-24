import java.util.HashMap;
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> login =new HashMap<>();
		
		login.put("ABC", "ABC!@#");
		login.put("PQR", "12345");
		login.put("XYZ", "password123");
		login.put("LMN", "get554");
		//login.put("ABC", "ABC!@#");
		
		System.out.println(login);
		
		System.out.println("PQR's Password = "+login.get("PQR")+"\n");
		
		login.replace("PQR", "12345","abcdef");
		System.out.println("PQR's new Password = "+login.get("PQR"));
	}

}
