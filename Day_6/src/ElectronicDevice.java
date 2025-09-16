
public class ElectronicDevice {  //super class
	
 protected String companyname;
 protected String Device;
 protected int units;
 
 public ElectronicDevice(String Device,String companyname,int units){
	 this.Device=Device;
	 this.companyname=companyname;
	 this.units=units;
 }

@Override
public String toString() {
	return super.toString()+"Device name = "+Device+"Company name = "+companyname+"Units = "+units;
}
	
			                           

}




