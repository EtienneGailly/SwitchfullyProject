package basic.solutions.codelab01;

public class Driver {
    private String name;
    private int age;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "a driver called " + name + " of " + age + " years old";
    }
}
