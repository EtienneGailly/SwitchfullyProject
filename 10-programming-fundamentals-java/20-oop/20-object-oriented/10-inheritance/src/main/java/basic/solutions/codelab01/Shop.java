package basic.solutions.codelab01;

import java.awt.*;

public class Shop {
    private Car[] cars = new Car[]{
            new Car("1", "Peugeot", Color.white),
            new Car("2", "Volkswagen", Color.gray),
            new SportsCar("3", "Ferrari", Color.red),
            new SportsCar("4", "Porsche", Color.yellow),
            new SUV("5", "Jeep", Color.green, true),
            new SUV("6", "Dodge", Color.blue, false),
    };


    public Car getCar(String identifier) {
        for (Car car : cars) {
            if (car.getIdentifier().equals(identifier)) {
                return car;
            }
        }
        return null;
    }
}
