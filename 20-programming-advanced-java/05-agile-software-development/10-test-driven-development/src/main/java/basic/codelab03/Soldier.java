package basic.codelab03;

public class Soldier {
    private boolean isFrontMan;
    private Weapon weapon;

    public Soldier() {
        this.weapon = Weapon.BAREFISTS;
    }

    public Soldier(Weapon weapon) {
        this.weapon = weapon;
    }

    public boolean fight(Soldier soldier) {
        return this.weapon.getDamage() >= soldier.weapon.getDamage();
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
