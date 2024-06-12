package basic.solutions.codelab01;

import java.awt.*;

public class SportsCar extends Car{

    public SportsCar(String identifier, String model, Color color) {
        super(identifier, model, color);
    }

    @Override
    public String getHorsepower() {
        return "350hp";
    }

    @Override
    public void turnOnEngine() {
        System.out.println("Brabrabrabraaa");
    }

}
