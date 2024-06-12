package advanced.solutions.codelab01.soldier;

import advanced.solutions.codelab01.armor.Armor;
import advanced.solutions.codelab01.weapon.Weapon;

public class Soldier {
    private String name;
    private int age;
    private Weapon weapon;
    private Armor armor;

    public Soldier(String name, int age, Weapon weapon, Armor armor) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
        this.armor = armor;
    }

    public int getAttackingPower() {
        return weapon.getAttackingPower();
    }

    public int getDefendingPower() {
        return armor.getDefendingPower();
    }
}
