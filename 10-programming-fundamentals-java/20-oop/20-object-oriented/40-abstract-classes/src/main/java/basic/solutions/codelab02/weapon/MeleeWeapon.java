package basic.solutions.codelab02.weapon;

import basic.solutions.codelab02.Enemy;

public class MeleeWeapon extends Weapon {

    public static final int DEFAULT_AMOUNT_OF_DAMAGE = 8;

    public MeleeWeapon() {
        super(DEFAULT_AMOUNT_OF_DAMAGE);
    }

    @Override
    public void dealDamageTo(Enemy enemy) {
        enemy.stab(getAmountOfDamage());
    }
}
