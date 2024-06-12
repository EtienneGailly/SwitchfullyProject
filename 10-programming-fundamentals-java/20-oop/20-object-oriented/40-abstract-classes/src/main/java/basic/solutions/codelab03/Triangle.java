package basic.solutions.codelab03;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(Color color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * base / 2;
    }

    @Override
    public String toString() {
        return "Triangle with base: " + base + " height: " + height + " and " + super.toString();
    }
}
