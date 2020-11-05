package com;

public class Account {

	private long accNum;
	private double balance;
	private Person accHolder;
	
	{
		Double d = Math.random();
		String str = d.toString();
		accNum = Long.parseLong(str.substring(3,13));
	}
	public Account() {
		super();
	}
	public Account(Person accHolder, double balance) {
		super();
		this.balance = balance;
		this.accHolder = accHolder;
	}
	public Account(String name, float age, double balance) {
		Person accHolder = new Person(name,age);
		this.balance = balance;
		this.accHolder = accHolder;
	}
	
	public long getAccNum() {
		return accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	public String toString() {
		return "AccNum: "+accNum+"\tHolder Name: "+accHolder.getName()+"\tBalance"+balance;
	}
	
	public void deposit (double deposit) {
		balance += deposit;
	}
	public void withdraw (double withdraw) {
			balance -= withdraw;
	}
}
