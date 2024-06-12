package basic.solutions.codelab01.car;

public class Car {

    private String type;
    private String brand;
    private String color;

    public Car(String type, String brand, String color) {
        this.type = type;
        this.brand = brand;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public void turnOn() {
        System.out.println("Vroom vroom!");
    }

    public void pressBreak() {
        System.out.println("Iiiiii!");
    }
}
