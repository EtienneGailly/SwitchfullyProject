package basic.solutions.codelab02;

public class Pet {
    private final String name;
    private final double price;
    private final boolean isHealthy;

    public Pet(String name, double price, boolean isHealthy) {
        this.name = name;
        this.price = price;
        this.isHealthy = isHealthy;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public boolean buy(double offeredMoney) {
        return isHealthy && offeredMoney >= price;
    }
}
