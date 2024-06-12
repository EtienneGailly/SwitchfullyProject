package basic.solutions.codelab03;

public abstract class Shape {

    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "color: " + color.toString();
    }
}
