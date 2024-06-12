package basic.solutions.codelab02.weapon;

import basic.solutions.codelab02.Enemy;

public class EnergyWeapon extends Weapon {

    public static final int DEFAULT_AMOUNT_OF_DAMAGE = 20;

    public EnergyWeapon() {
        super(DEFAULT_AMOUNT_OF_DAMAGE);
    }

    @Override
    public void dealDamageTo(Enemy enemy) {
        enemy.stun(getAmountOfDamage());
    }
}
