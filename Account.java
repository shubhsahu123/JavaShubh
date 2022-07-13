package com.rays.basics;

public class Account {
	private String number;
	private String accountType;
	private double balance;
	double gst=1.77;
	
	public void setNumber(String number) {
		this.number=number;
	}
	public String getNumber() {
		return number;
			}
	
	public void setAccountType(String accountType) {
		this.accountType=accountType;
		
	}
	public String getAccountType() {
		return accountType;
	
	}
		public void setBalance(double balance) {
			this.balance=balance;
			
		}
		public double getBalance() {
			return balance;
				}
			
		public void  deposit(double bal) {
			double currentBalance = bal +getBalance();
			setBalance(currentBalance);
			
		}
		
		public void withdrawl(double with) {
			double currentBalance= getBalance() - with ;
			setBalance(currentBalance);
			
		}
		public void fundTransfer(double fundT) {
			double currentBalance= getBalance() - fundT -gst ;
			setBalance(currentBalance);
			
		}
		
	
	
}
