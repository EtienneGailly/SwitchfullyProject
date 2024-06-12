package code_example;


import static code_example.Direction.LEFT;

public class Application {

    public static void main(String[] args) {
        Coordinate coordinate = new Coordinate(0, 0);
        Coordinate newCoordinate = coordinate.move(LEFT);
        System.out.println(newCoordinate);
    }
}
