package basic.solutions.codelab03;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(Color color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle with width: " + width + " length: " + length + " and " + super.toString();
    }
}
