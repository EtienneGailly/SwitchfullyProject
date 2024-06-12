package basic.solutions.codelab02;

public class Triangle extends Shape {
  private final int width;
  private final int height;

  public Triangle(Color color, int width, int height) {
    super(color);
    this.width = width;
    this.height = height;
  }

  public int getHeight() {
    return height;
  }

  @Override
  public double getArea() {
    return (height * width) / 2;
  }

  @Override
  public String toString() {
    return getColor() + " shape with width " + width + " and height " + getHeight();
  }

}
