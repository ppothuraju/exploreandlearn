package com.mudra.learn.module4;

public class Account {
	
	double account1 = 0;
	double account2 = 0;
	double totalBalance = 0;
	
	private double addBalances()
	{

		return totalBalance = account1 + account2;
	}
	
    public Account (double a1, double a2)
	{
		this.account1=a1;
		this.account2=a2;
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account = new Account(550.00, 255.55);
		
		System.out.println(account.addBalances());
		
	}

}
