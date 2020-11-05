package com;

public class Question1 {

	public static void main(String[] args) {
		Account acc1 = new Account("Smith",22.0f,2000.0);
		Account acc2 = new Account("Kathy",24.0f,3000.0);
		
		acc1.deposit(2000.0);
		acc2.withdraw(2000.0);
		
		System.out.println("Account Holder: "+acc1.getAccHolder().getName()+"\tBalance: "+acc1.getBalance());
		System.out.println("Account Holder: "+acc2.getAccHolder().getName()+"\tBalance: "+acc2.getBalance());
	}

}
