package hw10task3;



public class Main_ShapeHW10 {
    public static void main(String[] args) {
        ShapeHW10[] shapes = new ShapeHW10[3];
        shapes[0] = new CircleHW10("red",3,5,9,11);
        shapes[1] = new RectangleHW10("green",6,1,6, 12, 2,1,2,12);
        shapes[2] = new TriangleHW10("blue",1,3,2,8,4,8);

        for (ShapeHW10 shape : shapes) {
            shape.calculateArea();
            shape.calculatePerimeter();
            shape.paint();
            System.out.println(shape.toString());
            System.out.println(shape.hashCode());
            System.out.println();
        }


    }
}
