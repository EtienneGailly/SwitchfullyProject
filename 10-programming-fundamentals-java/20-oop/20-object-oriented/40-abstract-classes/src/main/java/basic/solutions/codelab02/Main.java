package basic.solutions.codelab02;

import basic.solutions.codelab02.weapon.BallisticWeapon;
import basic.solutions.codelab02.weapon.EnergyWeapon;
import basic.solutions.codelab02.weapon.MeleeWeapon;

public class Main {

    public static void main(String[] args) {
        Enemy enemy = new Enemy("The big bad wolf");

        BallisticWeapon ballisticWeapon = new BallisticWeapon();
        ballisticWeapon.dealDamageTo(enemy);

        EnergyWeapon energyWeapon = new EnergyWeapon();
        energyWeapon.dealDamageTo(enemy);

        MeleeWeapon meleeWeapon = new MeleeWeapon();
        meleeWeapon.dealDamageTo(enemy);
    }
}
