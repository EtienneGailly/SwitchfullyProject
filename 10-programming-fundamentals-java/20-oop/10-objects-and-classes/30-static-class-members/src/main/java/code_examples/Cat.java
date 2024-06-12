package code_examples;

public class Cat {

    public static final int DEFAULT_NUMBER_OF_LIVES = 9;
    private static int numberOfCatsCreated = 0;

    private String name;

    public String getName() {
        return name;
    }

    public Cat() {
        numberOfCatsCreated++;
    }

    public static Cat createGreenCat() {
        return new Cat();
    }

    public static int fight(Cat cat1, Cat cat2) {
        return 0;
    }
}
