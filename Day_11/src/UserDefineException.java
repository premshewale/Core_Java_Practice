
public class UserDefineException extends Exception {

		String msg1;
		public UserDefineException(String m){
			msg1=m;
		}
			public String getMessage(){
		// TODO Auto-generated method stub
		 return msg1;
	}

}
