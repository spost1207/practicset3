package base;

public class InsufficientFundsException extends Exception{
	private double amount; 
	public InsufficientFundsException(double amount) {
		this.amount = amount;
	}
	public double getOverDrawAmount() {
		return amount;
	}
}