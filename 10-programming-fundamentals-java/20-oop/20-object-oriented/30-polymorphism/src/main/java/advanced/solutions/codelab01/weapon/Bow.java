package advanced.solutions.codelab01.weapon;

import static advanced.solutions.codelab01.weapon.HandsNeeded.TWO_HANDED;

public class Bow extends Weapon {

    public Bow() {
        super("Bow", AttackingPower.MEDIUM, TWO_HANDED);
    }
}
