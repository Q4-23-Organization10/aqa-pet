package hw10task2;

public class Book implements Printable {
    public String title;
    public String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println("Book: " + title + "author: " + author);
    }

    public static void printBooks(Printable[] printable) {
        for (Printable p : printable) {
            if (p instanceof Book) {
                p.print();
            }
        }
    }
}
