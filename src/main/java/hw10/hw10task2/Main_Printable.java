package main.java.hw10.hw10task2;

public class Main_Printable {
    public static void main(String[] args) {
        Printable[] printables = new Printable[4];
        printables[0] = new Book("Harry Potter ", "J.K. Rowling");
        printables[1] = new Magazine("Magazine 1", "17.01.24");
        printables[2] = new Book("It ", "S. King");
        printables[3] = new Magazine("Magazine 2", "10.01.24");


        for (Printable printable : printables) {
            printable.print();
        }

        System.out.println("------------------------------------------");
        Magazine.printMagazines(printables);
        Book.printBooks(printables);
    }
}
