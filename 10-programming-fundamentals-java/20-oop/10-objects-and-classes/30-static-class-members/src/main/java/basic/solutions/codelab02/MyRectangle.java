package basic.solutions.codelab02;

public class MyRectangle {

    private static final int DEFAULT_X_COORDINATE = 5;
    private static final int DEFAULT_Y_COORDINATE = 10;
    private static final int DEFAULT_WIDTH = 50;
    private static final int DEFAULT_HEIGHT = 100;

    private static int instanceCount = 0;

    private int xCoordinate;
    private int yCoordinate;
    private int width;
    private int height;
    private String label;

    public MyRectangle(int xCoordinate, int yCoordinate, int width, int height) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.width = width;
        this.height = height;
        instanceCount++;
    }

    public MyRectangle() {
        this(DEFAULT_X_COORDINATE, DEFAULT_Y_COORDINATE, DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }

    public static MyRectangle createByCoordinate(int xCoordinate, int yCoordinate) {
        return new MyRectangle(xCoordinate, yCoordinate, DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }

    public static MyRectangle createByDimension(int width, int height) {
        return new MyRectangle(DEFAULT_X_COORDINATE, DEFAULT_Y_COORDINATE, width, height);
    }

    public static MyRectangle copy(MyRectangle base) {
        return new MyRectangle(base.getXCoordinate(), base.getYCoordinate(), base.getWidth(), base.getHeight());
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setDimensions(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
