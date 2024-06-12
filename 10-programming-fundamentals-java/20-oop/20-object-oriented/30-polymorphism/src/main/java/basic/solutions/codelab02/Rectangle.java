package basic.solutions.codelab02;

public class Rectangle extends Shape {
  private final int width;
  private final int length;

  public Rectangle(Color color, int width, int length) {
    super(color);
    this.width = width;
    this.length = length;
  }

  public int getLength() {
    return length;
  }

  @Override
  public double getArea() {
    return getLength() * width;
  }

  @Override
  public String toString() {
    return getColor() + " shape with width " + width + " and length " + getLength();
  }
}
