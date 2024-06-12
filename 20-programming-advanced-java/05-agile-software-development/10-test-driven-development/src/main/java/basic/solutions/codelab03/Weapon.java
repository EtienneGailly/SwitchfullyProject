package basic.solutions.codelab03;

public enum Weapon {

    BARE_FISTS(1.0),
    AXE(3.0),
    SWORD(2.0),
    SPEAR(3.5);

    private final double damage;

    Weapon(double damage) {
        this.damage = damage;
    }

    public double getDamage() {
        return damage;
    }
}
