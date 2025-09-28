
public class AdditionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addition add = new Addition();
		add.initvalues(50, 20);
		int ans=add.add();
		System.out.println("Addition ="+ans);
		
		add.yes();
	}

}
