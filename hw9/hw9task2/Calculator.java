package hw9task2;

public class Calculator {

        protected static double add(double a, double b) {

            return a + b;
        }

        protected static double subtract(double a, double b) {

            return a - b;
        }

        protected static double multiply(double a, double b) {

            return a * b;
        }

        protected static double divide(double a, double b) {
            if (b == 0) {
                System.out.println("Ділення на 0 неможливе");
            }
            return a / b;
        }
}
