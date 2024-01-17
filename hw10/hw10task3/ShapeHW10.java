package hw10task3;

public abstract class ShapeHW10 {
    protected String color;

    public ShapeHW10(String color) {
        this.color = color;
    }

    protected abstract void calculateArea();


    protected abstract void calculatePerimeter();
    protected abstract void paint();
}
