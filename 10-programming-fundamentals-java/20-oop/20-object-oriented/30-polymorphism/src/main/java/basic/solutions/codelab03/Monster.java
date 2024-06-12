package basic.solutions.codelab03;

public class Monster {

    private final String name;
    private int health = 10;
    private final int attackPower;

    public Monster(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getHealth() {
        return health;
    }

    protected void addHealth(int healthAmount) {
        health += healthAmount;
    }

    public void takeDamage(int damageAmount) {
        health = Math.max(0, health - damageAmount);
    }

    public void fight(Monster monster) {
        if (isAlive() && this != monster) {
            monster.takeDamage(getAttackPower());
        }
    }

    public boolean isAlive() {
        return health > 0;
    }

}
