package Interface;

public class TestRemote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			TV tv= new TV();
			tv.SwitchOn();
			tv.SwitchOff();
			
			
			DVDPlayer dp = new DVDPlayer();
			dp.SwitchOn();
			dp.SwitchOff();
	}

}
