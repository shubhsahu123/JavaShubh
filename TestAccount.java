package com.rays.basics;

public class TestAccount {
	public static void main(String[] args) {

		Account a = new Account();
		a.setNumber("3464102164");

		System.out.println("account no.     " + a.getNumber());
		
		a.setAccountType("saving");
		
		System.out.println("account type is   "+a.getAccountType());
		
		a.setBalance(15000);
		
		System.out.println("balance before "+a.getBalance());
		
		a.deposit(5000);
		
		System.out.println("balance after deposite   "+a.getBalance());		
		
		a.withdrawl(25000.25);
		
		System.out.println("balance after withdrawl   "  +  a.getBalance());

		a.fundTransfer(2300);
		System.out.println("balance after fund transfer" +a.getBalance());
		
		
	}

}
