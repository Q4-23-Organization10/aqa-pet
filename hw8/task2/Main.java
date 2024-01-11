package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        double number1 = scanner.nextDouble();

        System.out.print("Введіть друге число: ");
        double number2 = scanner.nextDouble();

        double sum = Calculator.add(number1, number2);
        System.out.println("Сума чисел: " + sum);

        double sub = Calculator.subtract(number1, number2);
        System.out.println("Різниця чисел: " + sub);

        double dob = Calculator.multiply(number1, number2);
        System.out.println("Добуток чисел: " + dob);

        double chas = Calculator.divide(number1, number2);
        System.out.println("Частка першоге числа: " + chas);

    }
}
