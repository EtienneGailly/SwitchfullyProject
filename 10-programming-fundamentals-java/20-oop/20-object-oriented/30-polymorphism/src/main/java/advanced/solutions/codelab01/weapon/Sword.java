package advanced.solutions.codelab01.weapon;

import static advanced.solutions.codelab01.weapon.HandsNeeded.ONE_HANDED;

public class Sword extends Weapon {
    public Sword() {
        super("Sword", AttackingPower.HIGH, ONE_HANDED);
    }
}
