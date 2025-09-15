
public class Account {
 private int accno;
 private String accholder;
 MyDate openingdate;
 
 public Account(int accno,String accholder,MyDate openingdate){
 this.accno=accno;
 this.accholder=accholder;
 this.openingdate=openingdate;
 
 }
 
 public String toString(){
		return accno+"\t"+accholder+"\t"+openingdate;
	}
}
