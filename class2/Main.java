package class2;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();

        System.out.println("Sum: " + calc.sum(5.5, 1.2));
        System.out.println("Sub: " + calc.sub(5.5, 1.2));
        System.out.println("Multiply: " + calc.multiply(5.0, 10.0));
        System.out.println("Divide: " + calc.divide(5.0, 2.0));
        System.out.println("is prime: " + calc.isPrime(6.0));
    }
}
