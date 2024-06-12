package basic.solutions.codelab03;

/**
 * You don't have to change anything in this class.
 */
public class Person {

    private String name;
    private int heightInCm;

    public void setName(String newName) {
        name = newName;
    }

    public void setHeightInCm(int newHeightInCm) {
        heightInCm = newHeightInCm;
    }

    public String getName() {
        return name;
    }

    public int getHeightInCm() {
        return heightInCm;
    }

    public String askPersonAboutHimself() {
        return "Hello! My name is " + name + " and I'm " + heightInCm + "cm tall";
    }
}
