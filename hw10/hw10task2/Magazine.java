package hw10task2;

public class Magazine implements Printable{
    public String title;
    public String data;

    public Magazine(String title, String data) {
        this.title = title;
        this.data = data;
    }

    @Override
    public void print() {
        System.out.println("Magazine: " + title + "data: " + data);
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable p : printable) {
            if (p instanceof Magazine) {
                p.print();
            }
        }
    }
}
