package advanced.solutions.codelab01.weapon;

public enum AttackingPower {
    HIGH(5), VERY_HIGH(10), LOW(1), MEDIUM(3);

    private final int power;

    AttackingPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
