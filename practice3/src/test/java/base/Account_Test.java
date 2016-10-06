package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import base.Account;
import base.InsufficientFundsException;

public class Account_Test {
	
	Account x;
	
	@Before 
	public void setUp() throws Exception {
		x = new Account(1122, 20000, 4.5);
	}
	
	
	@Test
	public void WithDrawTest() throws InsufficientFundsException {
		x.Withdraw(2500);
		assertTrue(x.getBalance() == 17500);
	}
	
	@Test 
	public void Deposit() {
		x.Deposit(3000);
		assertTrue(x.getBalance() == 23000);
	}
	
	@Test(expected=InsufficientFundsException.class)
	public void overWithDrawlingTest() throws InsufficientFundsException {
		x.Withdraw(30000);
	}
	
	@After
	public void printStats() {
		java.util.Date dateCreated = new java.util.Date();
		
		System.out.println("The Balance is: " + x.getBalance());
		System.out.println("The Monthly Interest Rate is: " + x.getAnnualInterestRate());
		System.out.println("The Date Created is: " + dateCreated);
	}
}