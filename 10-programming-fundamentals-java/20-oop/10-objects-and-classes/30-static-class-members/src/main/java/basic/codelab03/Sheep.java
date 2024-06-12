package basic.codelab03;

import java.awt.*;
import java.util.Arrays;

public class Sheep {
    private String nickname;
    private double price;
    private Color color;

    private static int ActiveSheep = 0;

    private static final Color[] ALLOWED_COLORS = {Color.BLACK, Color.WHITE};
    private static final String[] FORBIDDEN_NAMES = {"dolly"};



    public Sheep(String nickName, double price, Color color) {
        if (checkNickName(nickName)) {
            this.nickname = nickName;
        }
        this.price = price;
        if (checkColor(color)) {
            this.color = color;
        }
        ActiveSheep++;
    }

    public boolean checkNickName(String nickName) {
        if (!Arrays.asList(FORBIDDEN_NAMES).contains(nickName.toLowerCase())) {
            return true;
        }
        else {
            throw new IllegalArgumentException("Nickname forbidden");
        }
    }

    public boolean checkColor(Color color) {
        if (Arrays.asList(ALLOWED_COLORS).contains(color)) {
            return true;
        }
        else {
            throw new IllegalArgumentException("Invalid color: " + color);
        }
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "I'm a sheep named " + nickname + " (which is not Dolly) and I'm " + (color == Color.WHITE ? "white" : "not white");
    }

    public static int amountOfActiveSheep() {
        return ActiveSheep;
    }
}
