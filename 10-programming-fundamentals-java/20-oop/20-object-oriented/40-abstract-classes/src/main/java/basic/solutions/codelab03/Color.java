package basic.solutions.codelab03;

public enum Color {
    RED("red"), BLUE("blue"), YELLOW("yellow");

    private final String label;

    Color(String label) {
        this.label = label;
    }


    @Override
    public String toString() {
        return label;
    }
}
