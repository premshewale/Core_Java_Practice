package Interface;

public class DVDPlayer implements RemoteDevice {

	@Override
	public void SwitchOn() {
		// TODO Auto-generated method stub
		System.out.println("Turn on DVD Player");
	}

	@Override
	public void SwitchOff() {
		// TODO Auto-generated method stub
		System.out.println("Turn off DVD Player");
	}

}
