package advanced.solutions.codelab01.weapon;

public class Weapon {
    private String name;
    private AttackingPower attackingPower;
    private HandsNeeded handsRequirement;

    public Weapon(String name, AttackingPower attackingPower, HandsNeeded handsNeeded) {
        this.name = name;
        this.attackingPower = attackingPower;
        this.handsRequirement = handsNeeded;
    }

    public int getAttackingPower() {
        return attackingPower.getPower();
    }
}
