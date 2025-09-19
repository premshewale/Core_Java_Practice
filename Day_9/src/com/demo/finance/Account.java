package com.demo.finance;

public class Account {
	 
	 private int accno;
	 private String accholder;
	 private double balance;
	 
	 public Account(int accno,String accholder,double balance){
	 this.accno=accno;
	 this.accholder=accholder;
	this.balance=balance;
	 
	 }


	@Override
	public String toString() {
		return "Account [accno=" + accno + (accholder != null ? " ,accholder=" + accholder : "")+ ", balance=" + balance + ", "
				 + "]";
	}
	 
	 
	}

