package advanced.solutions.codelab01.armor;

public enum DefendingPower {
    MEDIUM(3), LOW(1), ZERO(0), HIGH(5);

    private final int power;

    DefendingPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
