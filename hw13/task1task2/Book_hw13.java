package task1task2;

import hw10task2.Book;
import hw10task2.Printable;

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
        for (Printable_hw13 p : printable) {
            if (p instanceof Book) {
                p.print();
            }
        }
    }
}
