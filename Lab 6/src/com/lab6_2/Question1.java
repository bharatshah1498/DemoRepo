package com.lab6_2;

public class Question1 {

	public static void main(String[] args) {
		Account acc1 = null;
		try {
			acc1 = new Account("Smith",22.0f,2000.0);
			acc1.deposit(2000.0);
		} catch (AgeException e) {
			System.out.println(e);
		}
		
		Account acc2 = null;
		try {
			acc2 = new Account("Kathy",24.0f,3000.0);
			acc2.withdraw(2000.0);
		} catch (AgeException e) {
			System.out.println(e);
		}
		
		if (acc1 == null)
			System.out.println("Account 1 is null");
		else
			System.out.println("Account Holder: "+acc1.getAccHolder().getName()+"\tBalance: "+acc1.getBalance());
		if (acc2 == null)
			System.out.println("Account 1 is null");
		else
			System.out.println("Account Holder: "+acc2.getAccHolder().getName()+"\tBalance: "+acc2.getBalance());
	}

}
