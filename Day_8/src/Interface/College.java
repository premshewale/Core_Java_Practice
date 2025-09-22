package Interface;

public class College implements PuneUniversity{
	 
	public String collegename;

	public College(String collegename) {
		
		this.collegename = collegename;
	}

	@Override
	public void bcs() {
		// TODO Auto-generated method stub
		System.out.println("BCS course is available in college "+collegename);
	}


	

	@Override
	public void be() {
		// TODO Auto-generated method stub
		System.out.println("BE course is available in college "+collegename);
	}

	
	

}
