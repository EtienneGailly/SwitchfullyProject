package advanced.solutions.codelab01;

public class Goat {
    public int age;
    public Health health;

    public Goat(int age, Health health) {
        this.age = validateAge(age);
        this.health = health;
    }

    public int getAge() {
        return age;
    }

    public Health getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return "Goat - " + age + " years old - doing " + health;
    }

    private int validateAge(int age) {
        if(age < 1) return 1;
        if(age > getMaxAge()) return getMaxAge();
        return age;
    }

    public int getMaxAge() {
        return 10;
    }


}
