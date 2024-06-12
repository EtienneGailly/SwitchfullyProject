package advanced.solutions.codelab01.armor;

public class Armor {
    private String name;
    private DefendingPower defendingPower;

    public Armor(String name, DefendingPower defendingPower) {
        this.name = name;
        this.defendingPower = defendingPower;
    }

    public int getDefendingPower() {
        return defendingPower.getPower();
    }
}
