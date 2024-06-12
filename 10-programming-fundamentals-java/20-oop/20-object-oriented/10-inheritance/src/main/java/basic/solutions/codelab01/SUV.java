package basic.solutions.codelab01;

import java.awt.*;

public class SUV extends Car{

    private boolean is4WheelDrive;

    public SUV(String identifier, String model, Color color, boolean is4WheelDrive) {
        super(identifier, model, color);
        this.is4WheelDrive = is4WheelDrive;
    }

    @Override
    public String getHorsepower() {
        return "200hp";
    }
}
