package com.java.exception;

public class BankAtm
{
	int atmId;
	String bankName;
	String location;
	double balance;
	public BankAtm(int atmId, String bankName, String location, int balance)
	{
		super();
		this.atmId = atmId;
		this.bankName = bankName;
		this.location = location;
		this.balance = balance;
	}
	public   void withdraw(double amount )throws BankATMExcepion{
		
		double newAccountBalance=10000;
		if(balance<newAccountBalance|(balance<10000)){
			throw new BankATMExcepion("Balance is less than 10000. Cannot withdraw");
			
		}
		else{
			newAccountBalance=balance-amount;
			balance=newAccountBalance;
			System.out.println("Balance is "+balance);
			
	}}
	public void deposit(double amount)throws BankATMExcepion {
		double newAccountBalance=10000;
		if(amount<0.0){
			throw new BankATMExcepion("cannot deposit");
			
	}else{
		newAccountBalance =balance+amount;
		balance=newAccountBalance;
		
		System.out.println("balance is"+balance);
	}
	
	

	}

}
