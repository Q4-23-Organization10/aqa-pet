package task2;

public class Calculator {

    public Calculator() {

    }
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Дылення на 0 неможлыве");
        }
        return a / b;
    }

}
