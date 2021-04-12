package entities;

public class Account {
	
	private int number;
	private String holder;
	double balance;
	
	public Account(int number, String holder) {
	this.number = number;
	this.holder = holder;
	}
	
	public Account(int number, String holder, double initialDeposit) {
	this.number = number;
	this.holder = holder;
	deposit(initialDeposit);
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
	this.holder = holder;
	}
	
	public double getbalance() {
		return balance;
	}
	
	public void deposit (double amount) {
		this.balance = balance + amount;
	}
	
	public void withDraw (double amount) {
		this.balance = balance - amount - 5.0;
	}
	
	public String toString() {
		return "Account "
			 + number
		     + ", "
		     + "Holder: "
		     + holder
		     + ", "
		     + "Balance: $ "
		     + String.format("%.2f", balance);
		     
	}

}
