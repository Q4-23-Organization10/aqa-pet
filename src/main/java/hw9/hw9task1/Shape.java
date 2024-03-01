package main.java.hw9.hw9task1;

public abstract class Shape {

    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    protected abstract void calculateArea();


    protected abstract void calculatePerimeter();
    protected abstract void paint();
}
