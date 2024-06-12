package basic.solutions.codelab02;

public class Cat extends Pet {

    private boolean isAggressive;

    public Cat(String name, double price, boolean isHealthy, boolean isAggressive) {
        super(name, price, isHealthy);
        this.isAggressive = isAggressive;
    }

    @Override
    public boolean buy(double offeredMoney) {
        return super.buy(offeredMoney) && !isAggressive;
    }
}
