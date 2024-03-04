package main.java.hw13.hw13task1task2;



import java.util.Arrays;

public class Book_hw13 implements Printable_hw13{

    public String title;
    public String author;

    public Book_hw13 (String title, String author) {
        this.title = title;
        this.author = author;
    }
    @Override
    public void print() {
        System.out.println("Book: " + title + "author: " + author);
    }

    public static void printBooks13(Printable_hw13[] printable) {
        Arrays.stream(printable).filter(p -> p instanceof Book_hw13).forEach(Printable_hw13::print);
    }
}
