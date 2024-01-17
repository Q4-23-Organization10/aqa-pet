package hw10task1;

public class Model extends MobilePhone{

    public String brand;
    public String model;

    public Model(String color,String brand, String model) {
        super(color);
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Mobile Phone " +
                "brand: " + brand + '\'' +
                ", model: " + model + '\'' +
                ", color:" + color + '\'' ;
    }

    @Override
    public void sendMessages() {
        System.out.println("This message was sent from " + brand + " " + model);
    }

    @Override
    public void call() {
        System.out.println("The call was made from " + brand + " " + model);
    }
}
