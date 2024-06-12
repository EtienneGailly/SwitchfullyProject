package basic.solutions.codelab03;

import static basic.solutions.codelab03.Color.BLUE;
import static basic.solutions.codelab03.Color.RED;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                new Rectangle(RED, 10.0, 10.0),
                new Rectangle(BLUE, 20.0, 4.0),
                new Triangle(BLUE, 20.0, 4.0),
                new Triangle(BLUE, 20.0, 4.0)
        };

        for(Shape shape: shapes) {
            System.out.println(shape.toString() + " | With an area of: " + shape.getArea());
        }
    }
}
