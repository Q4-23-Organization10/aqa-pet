package hw10task3;

import hw9task1.Triangle;

import java.util.Objects;

import static java.lang.Math.sqrt;

public class TriangleHW10 extends ShapeHW10{
    private  int pointAx;
    private  int pointAy;
    private  int pointBx;
    private  int pointBy;
    private  int pointCx;
    private  int pointCy;


    public TriangleHW10 (String color, int pointAx, int pointAy, int pointBx, int pointBy, int pointCx, int pointCy) {
        super(color);
        this.pointAx = pointAx;
        this.pointAy = pointAy;
        this.pointBx = pointBx;
        this.pointBy = pointBy;
        this.pointCx = pointCx;
        this.pointCy = pointCy;

    }
    @Override
    public void calculateArea(){
        double sideA = sqrt((pointBx - pointAx)^2 + (pointBy - pointAy)^2);
        double sideB = sqrt((pointCx - pointAx)^2 + (pointCy - pointAy)^2);
        double s = (sideA + sideB) / 2;
        System.out.println("Площа трикурника " + s);
    }

    @Override
    public void calculatePerimeter(){
        double sideA = sqrt((pointBx - pointAx)^2 + (pointBy - pointAy)^2);
        double sideB = sqrt((pointCx - pointAx)^2 + (pointCy - pointAy)^2);
        double sideC = sqrt((pointCx - pointBx)^2 + (pointCy - pointBy)^2);
        double p = sideA + sideB + sideC;
        System.out.println("Периметр трикутника " + p);

    }

    @Override
    public void paint(){
        System.out.println("Координати трикутника ");
        System.out.println("Точка А: " + pointAx + ";" + pointAy + "; Точка B: " + pointBx + ";" + pointBy + "Точка C: " + pointCx + ";" + pointCy);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "pointAx=" + pointAx +
                ", pointAy=" + pointAy +
                ", pointBx=" + pointBx +
                ", pointBy=" + pointBy +
                ", pointCx=" + pointCx +
                ", pointCy=" + pointCy +
                ", color='" + color + '\'' +
                '}';
    }


    @Override
    public int hashCode() {
        return Objects.hash(pointAx, pointAy, pointBx, pointBy, pointCx, pointCy);
    }
}

