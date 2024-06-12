package basic.solutions.codelab02.weapon;

import basic.solutions.codelab02.Enemy;

public class BallisticWeapon extends Weapon {

    public static final int DEFAULT_AMOUNT_OF_DAMAGE = 10;

    public BallisticWeapon() {
        super(DEFAULT_AMOUNT_OF_DAMAGE);
    }

    @Override
    public void dealDamageTo(Enemy enemy) {
        enemy.hurt(getAmountOfDamage());
    }
}
