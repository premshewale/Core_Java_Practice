package demo.arithmetic.ops.main;

import demo.arithmetic.oprations.Addition;
import demo.arithmetic.oprations.Division;
import demo.arithmetic.oprations.Multiplication;
import demo.arithmetic.oprations.Substraction;

public class ArithmeticOprationsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition ad= new Addition(10, 20);
		ad.add();
		System.out.println(ad);
		
		Substraction sb= new Substraction(10, 20);
		sb.sub();
		System.out.println(sb);
		
		Multiplication ml=new Multiplication(10, 20);
		ml.multi();
		System.out.println(ml);
		
		Division dv= new Division(20, 10);
		dv.div();
		System.out.println(dv);
	}

}
