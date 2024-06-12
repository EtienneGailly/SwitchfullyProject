package basic.solutions.codelab03;

import static basic.solutions.codelab03.Weapon.BARE_FISTS;

public class Soldier {

    private final Weapon weapon;

    public Soldier() {
        this.weapon = BARE_FISTS;
    }

    public Soldier(Weapon weapon) {
        this.weapon = weapon;

    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    /**
     * @return Whether this instance of Soldier (=attacker) has won the fight.
     * Returns true if attacker and defender have the same weapon damage.
     */
    public boolean fight(Soldier defender) {
        return this.weapon.getDamage() >= defender.getWeapon().getDamage();
    }
}
