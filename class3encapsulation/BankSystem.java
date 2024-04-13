package class3encapsulation;

public class BankSystem {
	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente(1);
		ContaCorrente c2 = new ContaCorrente(2);
		
		System.out.println(c1.getBalance());
		System.out.println(c1.number);
		System.out.println(c2.number);
	}
}
