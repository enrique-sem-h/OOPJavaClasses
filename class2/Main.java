package class2;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();

        System.out.println("Sum: " + calc.sum(2.5, 2.5));
        System.out.println("Sub: " + calc.sub(5.5, 6.5));
        System.out.println("Multiply: " + calc.multiply(2.0, 3.0));
        System.out.println("Divide: " + calc.divide(6.6, 10.0));
        System.out.println("is prime: " + calc.isPrime(0.0));
        System.out.println("is prime: " + calc.isPrime(1.0));
        System.out.println("is prime: " + calc.isPrime(2.0));
        System.out.println("is prime: " + calc.isPrime(3.0));
        System.out.println("is prime: " + calc.isPrime(7.0));
        System.out.println("is prime: " + calc.isPrime(83.0));
        System.out.println("is prime: " + calc.isPrime(100.0));
        System.out.println("is prime: " + calc.isPrime(991.0));
        System.out.println("is prime: " + calc.isPrime(104729.0));
        System.out.println("is prime: " + calc.isPrime(14348907.0));
    }
}
