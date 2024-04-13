package class3encapsulation;

public class ContaCorrente {
	public int number;
	private double balance;
	
	private ContaCorrente() {
		
	}
	
	public ContaCorrente(int accNumber) {
		this.number = accNumber;
		this.balance = 0;
	}
	
	public double getNumber() {
		return this.number;
	}
	
	public double setNumber(int newNumber) {
		this.number = newNumber;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public double setBalance(int newBalance) {
		this.balance = newBalance;
	}
}
