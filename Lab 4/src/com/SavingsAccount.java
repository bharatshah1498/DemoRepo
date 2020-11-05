package com;

public class SavingsAccount extends Account {
	
	private final double minBalance = 500.0;

	public double getMinBalance() {
		return minBalance;
	}
	
	public void withdraw (double withdraw) {
		if (getBalance()<=minBalance || (getBalance()-withdraw)<0) {
			System.out.println("Insufficient Balance!!!");
		}
		else {
			super.withdraw(withdraw);
		}
	}
}