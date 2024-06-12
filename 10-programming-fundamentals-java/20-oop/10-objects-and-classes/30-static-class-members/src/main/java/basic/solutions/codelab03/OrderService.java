package basic.solutions.codelab03;

public class OrderService {

    private static final double ORDER_FEE = 5;

    public double orderSheep(Sheep sheep) {
        return sheep.getPrice() + ORDER_FEE;
    }

    public String orderFeeAsText() {
        return "The order fee is " + ORDER_FEE;
    }
}
