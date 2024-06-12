package code_example04;

public class Main {

    public static void main(String[] args) {
        Pet garfield = new Pet("Garfield", new Cat());
        System.out.println(garfield.feed());
        Pet droppy = new Pet("Droppy", new Dog());
        System.out.println(droppy.feed());
    }
}
