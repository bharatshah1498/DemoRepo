package com;

public class CurrentAccount extends Account {

	private double OverdraftLimit;

	public double getOverdraftLimit() {
		return OverdraftLimit;
	}
	public void setOverdraftLimit(double overdraftLimit) {
		OverdraftLimit = overdraftLimit;
	}
	
	public void withdraw (double withdraw) {	
		if ((getBalance()-withdraw) <= (-OverdraftLimit)) {
			System.out.println("Overdraft Limit Reached!!!");
		}
		else {
			super.withdraw(withdraw);
		}
	}
}
