package main.java.hw10.hw10task3;

import java.util.Objects;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class CircleHW10 extends ShapeHW10 {

    private  int pointAx;
    private  int pointAy;
    private  int pointBx;
    private  int pointBy;

    public CircleHW10(String color, int pointAx, int pointAy, int pointBx, int pointBy) {
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
    public int hashCode() {
        return Objects.hash(pointAx, pointAy, pointBx, pointBy);
    }
}
