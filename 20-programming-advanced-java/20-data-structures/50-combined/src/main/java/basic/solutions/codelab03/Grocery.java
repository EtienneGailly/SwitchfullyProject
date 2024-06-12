package basic.solutions.codelab03;

public final class Grocery {

    private final String name;

    public Grocery(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
