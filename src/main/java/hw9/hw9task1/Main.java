package main.java.hw9.hw9task1;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("red",3,5,9,11);
        shapes[1] = new Rectangle("green",6,1,6, 12, 2,1,2,12);
        shapes[2] = new Triangle("blue",1,3,2,8,4,8);

        for (Shape shape : shapes) {
            shape.calculateArea();
            shape.calculatePerimeter();
            shape.paint();
            System.out.println(shape.toString());
            System.out.println(shape.hashCode());
            System.out.println(shape.equals(shape));
            System.out.println();
        }


    }
}
