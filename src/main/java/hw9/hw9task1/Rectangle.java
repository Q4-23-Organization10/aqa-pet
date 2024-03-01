package main.java.hw9.hw9task1;

import java.util.Objects;

import static java.lang.Math.sqrt;

public class Rectangle extends Shape{
    private  int pointAx;
    private  int pointAy;
    private  int pointBx;
    private  int pointBy;

    private  int pointCx;
    private  int pointCy;

    private  int pointDx;
    private  int pointDy;


    public Rectangle(String color, int pointAx, int pointAy, int pointBx, int pointBy, int pointCx, int pointCy, int pointDx, int pointDy) {
        super(color);
        this.pointAx = pointAx;
        this.pointAy = pointAy;
        this.pointBx = pointBx;
        this.pointBy = pointBy;
        this.pointCx = pointCx;
        this.pointCy = pointCy;
        this.pointDx = pointDx;
        this.pointDy = pointDy;
    }
    @Override
    public void calculateArea(){
        double sideA = sqrt((pointBx - pointAx)^2 + (pointBy - pointAy)^2);
        double sideB = sqrt((pointDx - pointAx)^2 + (pointDy - pointAy)^2);
        double s = sideA * sideB;
        System.out.println("Площа прямокутника " + s);

    }

    @Override
    public void calculatePerimeter(){
        double sideA = sqrt((pointBx - pointAx)^2 + (pointBy - pointAy)^2);
        double sideB = sqrt((pointDx - pointAx)^2 + (pointDy - pointAy)^2);
        double p = 2 * (sideA + sideB);
        System.out.println("Периметр прямокутника " + p);

    }

    @Override
    public void paint(){
        System.out.println("Координати прямокутника ");
        System.out.println("Точка А: " + pointAx + ";" + pointAy + "; Точка B: " + pointBx + ";" + pointBy + "Точка C: " + pointCx + ";" + pointCy + "; Точка D: " + pointDx + ";" + pointDy);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "pointAx=" + pointAx +
                ", pointAy=" + pointAy +
                ", pointBx=" + pointBx +
                ", pointBy=" + pointBy +
                ", pointCx=" + pointCx +
                ", pointCy=" + pointCy +
                ", pointDx=" + pointDx +
                ", pointDy=" + pointDy +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return pointAx == rectangle.pointAx && pointAy == rectangle.pointAy && pointBx == rectangle.pointBx && pointBy == rectangle.pointBy && pointCx == rectangle.pointCx && pointCy == rectangle.pointCy && pointDx == rectangle.pointDx && pointDy == rectangle.pointDy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointAx, pointAy, pointBx, pointBy, pointCx, pointCy, pointDx, pointDy);
    }
}
