package class2;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.num1 = 1.0;
        calc.num2 = 3.4;
        calc.sum(calc.num1, calc.num2);

        System.out.println("Sum: " + calc.sum(5.5, 1.2));
        System.out.println("Sum: " + calc.sub(5.5, 1.2));
        System.out.println("Sum: " + calc.multiply(5.0, 10.0));
        System.out.println("Sum: " + calc.divide(5.0, 2.0));
    }
}
