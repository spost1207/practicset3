package base;

import java.util.Date;

import base.InsufficientFundsException;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;

	public Account() {
	}
	
	public Account(int ID, double Balance, double annualInterestRate) {
		this.id = ID;
		this.balance = Balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = new Date();
	}
	
	public int getID() {
		return id;
	}
	
	public void setID(int ID) {
		this.id = ID;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double Balance) {
		this.balance = Balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double interestRate) {
		this.annualInterestRate = interestRate;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		double MonthlyIR = (annualInterestRate / 12);
		return MonthlyIR;
	}
	
	public void Withdraw(double amount) throws InsufficientFundsException {
		 if(amount <= balance)
	      {
	         balance -= amount;
	      }
	      else
	      {
	    	 System.out.println("Insufficient funds");
	         double neededAmount = amount - balance;
	         throw new InsufficientFundsException(neededAmount);
	      }
	}
	
	public double Deposit(double amount){
		 balance += amount;
		 return balance;
	}
}