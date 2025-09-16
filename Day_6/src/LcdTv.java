
public class LcdTv extends TV  {
	 
	public LcdTv(String Device, String companyname, int units) {
		super(Device, companyname, units);
		// TODO Auto-generated constructor stub
	}


	
		
	@Override
	public String toString() {
		return "Device = "+Device+"\t Company Name = "+companyname+"\t TV Units " +units;
}
}


