package com.revature.model;

public interface Account {
	public boolean deposit(double amt);
	public double withdrawal(double amt);
	public boolean transfer(double amt, Account a);
	public Account open(Account a);
	public boolean close();
}
