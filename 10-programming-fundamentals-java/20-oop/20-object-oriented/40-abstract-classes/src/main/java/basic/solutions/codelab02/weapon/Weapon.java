package basic.solutions.codelab02.weapon;

import basic.solutions.codelab02.Enemy;

public abstract class Weapon {

    private final int amountOfDamage;

    public Weapon(int amountOfDamage) {
        this.amountOfDamage = amountOfDamage;
    }

    public abstract void dealDamageTo(Enemy enemy);

    protected int getAmountOfDamage() {
        return amountOfDamage;
    }
}
