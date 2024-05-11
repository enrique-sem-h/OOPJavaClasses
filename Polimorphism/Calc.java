package Polimorphism;

public class Calc {
	public int sum(int a, int b) {
		System.out.println("sum - " + (a + b));
		return a + b;
	}
	
	public double sum(Double a, Double b) {
		System.out.println("sum - " + (a + b));
		return a + b;
	}
}
