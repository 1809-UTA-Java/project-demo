package com.revature.model;

public class CheckingAccount implements Account {
	
	private double balance;

	public CheckingAccount() {
		// TODO Auto-generated constructor stub
	}

	public boolean deposit(double amt) {
		double current = balance;
		if(amt > 0) {
			balance += amt;
		}
		
		if(amt == 0) {
			throw new NullPointerException();
		}
		
		return (balance == current + amt ? true : false);
	}

	public double withdrawal(double amt) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean transfer(double amt, Account a) {
		// TODO Auto-generated method stub
		return false;
	}

	public Account open(Account a) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean close() {
		// TODO Auto-generated method stub
		return false;
	}

}
