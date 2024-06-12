package basic.solutions.codelab01;

import java.awt.*;
import java.util.Objects;

public class Car {
    private String identifier;
    private String model;
    private Color color;

    public Car(String identifier, String model, Color color) {
        this.identifier = identifier;
        this.model = model;
        this.color = color;
    }

    public String getHorsepower() {
        return "120hp";
    }

    public void turnOnEngine(){
        System.out.println("Vroom vroom");
    }

    public String getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(identifier, car.identifier) && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, model, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "identifier='" + identifier + '\'' +
                ", model='" + model + '\'' +
                ", color=" + color +
                '}';
    }
}

