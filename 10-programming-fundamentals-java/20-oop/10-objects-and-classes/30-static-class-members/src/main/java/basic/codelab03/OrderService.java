package basic.codelab03;

import java.awt.*;

public class OrderService {
    private static final int ORDER_FEE = 5;

    public static void main(String[] args) {
        Sheep henri = new Sheep("Henri",500, Color.WHITE);
        Sheep laura = new Sheep("Laura",300, Color.BLACK);
        //Sheep john = new Sheep("John",200,Color.RED);
        //Sheep dolly = new Sheep("doLLy",100,Color.WHITE);
        System.out.println(orderSheep(henri));
        System.out.println(orderSheep(laura));
    }

    public static double orderSheep(Sheep sheep) {
        return sheep.getPrice() + ORDER_FEE;
    }

    public static String orderFeeAsText() {
        return "The order fee is " + ORDER_FEE;
    }
}
