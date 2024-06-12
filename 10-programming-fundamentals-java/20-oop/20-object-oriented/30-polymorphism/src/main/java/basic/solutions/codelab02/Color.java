package basic.solutions.codelab02;

public enum Color {
  RED("Red"),
  BLUE("Blue"),
  GREEN("Green"),
  YELLOW("Yellow");


  private final String label;

  Color(String label) {
    this.label = label;
  }

  @Override
  public String toString() {
    return label;
  }
}
