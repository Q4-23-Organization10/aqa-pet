package main.java.HW6;

import java.util.Scanner;

public class HW6Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число: ");
        int number = scanner.nextInt();


        if (number % 2 != 0) {
            System.out.println("Odd number");
        } else {
            System.out.println("Even number");
        }

        System.out.println("BYE");

        scanner.close();
    }
}
