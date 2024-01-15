package hw9task1;

import java.util.Objects;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class Circle extends Shape{

    private  int pointAx;
    private  int pointAy;
    private  int pointBx;
    private  int pointBy;

    public Circle(String color, int pointAx, int pointAy, int pointBx, int pointBy) {
        super(color);
        this.pointAx = pointAx;
        this.pointAy = pointAy;
        this.pointBx = pointBx;
        this.pointBy = pointBy;
    }


    @Override
    public void calculateArea(){
        double radius =  sqrt((pointBx - pointAx)^2 + (pointBy - pointAy)^2);
        double s = PI * radius * radius;
        System.out.println("Площа круга " + s);

    }

    @Override
    public void calculatePerimeter(){
        double radius =  sqrt((pointBx - pointAx)^2 + (pointBy - pointAy)^2);
        double p = 2 * PI * radius;
        System.out.println("Периметр круга " + p);
    }

    @Override
    public void paint(){
        System.out.println("Координати круга ");
        System.out.println("Точка А: " + pointAx + ";" + pointAy + "; Точка B: " + pointBx + ";" + pointBy);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "pointAx=" + pointAx +
                ", pointAy=" + pointAy +
                ", pointBx=" + pointBx +
                ", pointBy=" + pointBy +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return pointAx == circle.pointAx && pointAy == circle.pointAy && pointBx == circle.pointBx && pointBy == circle.pointBy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointAx, pointAy, pointBx, pointBy);
    }
}
