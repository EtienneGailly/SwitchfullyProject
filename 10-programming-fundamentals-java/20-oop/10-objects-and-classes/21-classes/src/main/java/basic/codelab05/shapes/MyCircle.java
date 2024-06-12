package basic.codelab05.shapes;

public class MyCircle {

    private double radius;
    private String color;

    public MyCircle(double radius) {
        this.radius = radius;
        this.color = "blue";
    }

    public MyCircle() {
        this(1.0);
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
