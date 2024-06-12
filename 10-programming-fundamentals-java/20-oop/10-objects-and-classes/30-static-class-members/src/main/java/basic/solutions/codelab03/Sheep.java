package basic.solutions.codelab03;

import java.awt.*;

public class Sheep {
    private static final String FORBIDDEN_NICKNAME = "Dolly";
    private static int amountOfActiveSheep = 0;

    private String nickname;
    private double price;
    private Color color;

    public Sheep(String nickname, double price, Color color) {
        if (nickname.equals(FORBIDDEN_NICKNAME)) {
            throw new IllegalArgumentException("Dolly can't be a nickname");
        }
        if (!color.equals(Color.BLACK) && !color.equals(Color.WHITE)) {
            throw new IllegalArgumentException("Color can only be black or white");
        }
        this.nickname = nickname;
        this.price = price;
        this.color = color;
        amountOfActiveSheep++;
    }

    public static int amountOfActiveSheep() {
        return amountOfActiveSheep;
    }

    @Override
    public String toString() {
        return "I'm a sheep named " + nickname + " (which is not Dolly) and I'm " + (Color.WHITE == color ? "white" : "not white");
    }

    public double getPrice() {
        return price;
    }
}
