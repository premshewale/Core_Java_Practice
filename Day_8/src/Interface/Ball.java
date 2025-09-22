package Interface;

public class Ball implements Bounceable,Movable{

	@Override
	public void bounce() {
		// TODO Auto-generated method stub
		System.out.println("Ball is Bouncing.-.-.-.-.-.-.");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Ball is Moving========");
	}
	
	

}
