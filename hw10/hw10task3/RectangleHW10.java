package hw10task3;

import hw9task1.Rectangle;

import java.util.Objects;

import static java.lang.Math.sqrt;

public class RectangleHW10 extends ShapeHW10{
    private  int pointAx;
    private  int pointAy;
    private  int pointBx;
    private  int pointBy;

    private  int pointCx;
    private  int pointCy;

    private  int pointDx;
    private  int pointDy;


    public RectangleHW10 (String color, int pointAx, int pointAy, int pointBx, int pointBy, int pointCx, int pointCy, int pointDx, int pointDy) {
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
    public int hashCode() {
        return Objects.hash(pointAx, pointAy, pointBx, pointBy, pointCx, pointCy, pointDx, pointDy);
    }
}
