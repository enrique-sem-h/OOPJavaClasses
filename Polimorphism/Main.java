package Polimorphism;

public class Main {
	public static void main(String[] args) {
		Calc calc = new Calc();
		int sum = 0;
		
		calc.sum(1.0, 2.2);
		System.out.println(sum);
		
		Animal a1 = new Animal();
		Dog a2 = new Dog();
		
		a1.makeSound();
		a2.makeSound();
		
		Car c1 = new Car();
		Motorcycle m1 = new Motorcycle();
		
		accelerateVehicle(c1);
		accelerateVehicle(m1);
	}
	
	public static void accelerateVehicle(Vehicle v) {
		v.accelerate();
	}
}
