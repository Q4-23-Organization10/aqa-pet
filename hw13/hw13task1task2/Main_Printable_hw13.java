package hw13task1task2;


import java.util.Arrays;

import static hw13task1task2.Printable_hw13.printableInterfice;

public class Main_Printable_hw13 {
    public static void main(String[] args) {
        Printable_hw13[] print = new Printable_hw13[4];
        print[0] = new Book_hw13("Harry Potter ", "J.K. Rowling");
        print[1] = new Magazine_hw13("Magazine 1", "17.01.24");
        print[2] = new Book_hw13("It ", "S. King");
        print[3] = new Magazine_hw13("Magazine 2", "10.01.24");

        Arrays.stream(print).forEach(Main_Printable_hw13::printUsingMethodReference);


        System.out.println("------------------------------------------");
        Magazine_hw13.printMagazines13(print);
        Book_hw13.printBooks13(print);

        System.out.println("------------------------------------------");

        printableInterfice.print();


    }

    public static void printUsingMethodReference(Printable_hw13 printable) {
        printable.print();
    }
}
