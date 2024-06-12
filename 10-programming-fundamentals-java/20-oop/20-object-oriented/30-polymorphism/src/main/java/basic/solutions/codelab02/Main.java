package basic.solutions.codelab02;

import static basic.solutions.codelab02.Color.*;

public class Main {

  public static void main(String[] args) {
    Shape[] shapeArray = new Shape[]{
      new Rectangle(BLUE, 2, 3),
      new Rectangle(RED, 3, 7),
      new Triangle(RED, 2, 3),
      new Triangle(YELLOW, 3, 7)
    };

    for (Shape shape : shapeArray) {
      System.out.println(shape.getArea());
      System.out.println(shape);
    }
  }
}
