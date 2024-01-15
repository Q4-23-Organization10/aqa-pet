package hw9task2;

import task2.Calculator;

import java.util.Scanner;

public class Main_Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EngineeringCalculator engineeringCalculator = new EngineeringCalculator();
        ProgrammingCalculator programmingCalculator = new ProgrammingCalculator();

        System.out.print("Введіть перше число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введіть друге число: ");
        int number2 = scanner.nextInt();

        double sum = EngineeringCalculator.add(number1,number2);
        System.out.println("Сума чисел: " + sum);

        double sub = ProgrammingCalculator.subtract(number1,number2);
        System.out.println("Різниця чисел: " + sub);

        double sine = engineeringCalculator.sine(number2);
        System.out.println("Синус першого числа: " + sine);

        System.out.println("Десятичне у бінарне: " + programmingCalculator.decimalToBinary(number1));
    }
}
