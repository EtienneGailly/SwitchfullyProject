package basic.solutions.codelab02;

public class Shape {
  private final Color color;

  public Shape(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return color;
  }

  public double getArea() {
    return 0.0;
  }

  @Override
  public String toString() {
    return color.toString();
  }
}
