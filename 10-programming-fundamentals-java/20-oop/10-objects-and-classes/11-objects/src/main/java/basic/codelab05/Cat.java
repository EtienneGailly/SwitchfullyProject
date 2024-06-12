package basic.codelab05;

import java.awt.*;

/**
 * You don't have to change anything in this class.
 */
public class Cat {

    private final Color color;
    private final String name;
    private final int ageInYears;

    public Cat() {
        color = Color.BLACK;
        name = "Generic cat";
        ageInYears = 99;
    }

    public Cat(String name, int ageInYears, Color color) {
        this.color = color;
        this.name = name;
        this.ageInYears = ageInYears;
    }

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public int getAgeInYears() {
        return ageInYears;
    }

    public void miauw() {
        System.out.println(name + " says MIAUW!");
    }

    public static String fight(Cat attackingCat, Cat defendingCat) {
        if(attackingCat.getAgeInYears() <= defendingCat.getAgeInYears()) {
            return "The following cat has won the fight: " + attackingCat;
        } else {
            return "The following cat has won the fight: " + defendingCat;
        }
    }

    @Override
    public String toString() {
        return String.format("I am a cat named %s, have color %s and I'm %d years old.", name, color.toString(), ageInYears);
    }
}
