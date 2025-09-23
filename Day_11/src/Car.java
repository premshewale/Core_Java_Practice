
public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ferrari fe=new Ferrari();
		fe.drive();
		fe.run();
		
		Ferrari fe1=new Ferrari(){
		public void drive(){
			System.out.println("Ferrari");
		}
		public void run(){
			System.out.println("running.........");
		}
	};
	fe1.drive();
	fe1.run();

}
}
