package com.demo.test;

public class Addition {
	private int num1,num2,ans;

	public Addition(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		
	}
	public void add(){
		ans=num1+num2;
	}
	@Override
	public String toString() {
		return "Addition [ans=" + ans + "]";
	}

}
