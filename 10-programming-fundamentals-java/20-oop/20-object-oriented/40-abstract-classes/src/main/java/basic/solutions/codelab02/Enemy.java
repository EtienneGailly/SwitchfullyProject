package basic.solutions.codelab02;

public class Enemy {

    private final String name;

    private int health = 100;

    public Enemy(String name) {
        this.name = name;
    }

    public void stab(int amountOfDamage) {
        System.out.println(name + " was stabbed for " + amountOfDamage + " damage.");
        damage(amountOfDamage);
    }

    private void damage(int amountOfDamage) {
        health -= amountOfDamage;
        System.out.println("It has " + health + "hp left.");
    }

    public void stun(int amountOfDamage) {
        System.out.println(name + " was stunned for " + amountOfDamage + " damage.");
        damage(amountOfDamage);
    }

    public void hurt(int amountOfDamage) {
        System.out.println(name + " was hurt for " + amountOfDamage + " damage.");
        damage(amountOfDamage);
    }
}
