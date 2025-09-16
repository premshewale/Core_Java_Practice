
public class TV extends ElectronicDevice  {
	 
	
	 
	public TV(String Device,String companyname,int units){
		super(Device,companyname,units);
		
		
	}
	
		
	@Override
	public String toString() {
		return "Device = "+Device+"\t Company Name = "+companyname+"\t TV Units " +units;
}
}

