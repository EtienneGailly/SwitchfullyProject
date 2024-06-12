package basic.solutions.codelab01.animal;

public class Animal {
    private String type;
    private String name;
    private int health;

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
        this.health = 100;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void feed() {
        this.health = Math.min(this.health + 10, 100);
    }

    public void letDayPass() {
        this.health = Math.max(this.health - 10, 0);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", health=" + health +
                '}';
    }

}
