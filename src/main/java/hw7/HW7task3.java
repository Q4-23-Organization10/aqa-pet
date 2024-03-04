package main.java.hw7;

import java.util.Random;

public class HW7task3 {
    public static void main(String[] args) {
        Random random = new Random();

        int [] array = new int[8];

        System.out.println("Початковий масив:");

        for (int i = 0; i < array.length; i++) {
            array [i]= random.nextInt(100);
            System.out.println(array [i]);
        }

        System.out.println("Змінений масив:");

        for (int i = 0; i < array.length; i++) {
            if ( array [i] % 2 == 0)
                array [i] = 0;

            System.out.println(array [i]);
        }
    }
}
