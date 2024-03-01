package main.java.hw13.hw13task1task2;

import java.util.Arrays;

public class Magazine_hw13 implements Printable_hw13 {

    public String title;
    public String data;

    public Magazine_hw13(String title, String data) {
        this.title = title;
        this.data = data;
    }


    @Override
    public void print() {
        System.out.println("Magazine: " + title + "data: " + data);
    }

    public static void printMagazines13(Printable_hw13[] printable) {
        Arrays.stream(printable).filter(p -> p instanceof Magazine_hw13).forEach(Printable_hw13::print);
    }
}
