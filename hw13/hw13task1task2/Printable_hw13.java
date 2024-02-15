package hw13task1task2;

@FunctionalInterface
public interface Printable_hw13 {
    void print();

    Printable_hw13 printableInterfice = () -> System.out.println("Print Interface");
    ;
}
