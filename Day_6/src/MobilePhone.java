
public class MobilePhone extends ElectronicDevice{

	 
	public MobilePhone(String Device,String companyname,int units){
		super(Device,companyname,units);
		
	}
	
		
	@Override
	public String toString() {
		return "Device = "+Device+"\t Company Name = "+companyname+"\t MobilePhone Units " +units;
}
}




