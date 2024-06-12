package basic.solutions.codelab05.shapes;

public class MyCircle {

    public static final String DEFAULT_COLOR = "blue";
    public static final double DEFAULT_RADIUS = 1.0;
    private double radius;
    private String color;

    public MyCircle(double radius) {
        this.radius = radius;
        this.color = DEFAULT_COLOR;
    }

    public MyCircle() {
        this(DEFAULT_RADIUS);
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
