package basic.codelab02;

public class MyRectangle {
    private int xCoordinate;
    private int yCoordinate;
    private int width;
    private int height;
    private String label;
    private static int instanceCount = 0;

    public MyRectangle() {
        this(5,10,50,100);
    }

    public static MyRectangle createByCoordinates(int xCoordinate, int yCoordinate) {
        return new MyRectangle(xCoordinate,yCoordinate,50,100);
    }

    public static MyRectangle createByDimensions(int width, int height) {
        return new MyRectangle(5, 10, width,height);
    }

    public MyRectangle(int xCoordinate, int yCoordinate, int width, int height) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.width = width;
        this.height = height;
        MyRectangle.instanceCount ++;
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

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public int calculateArea() {
        return width * height;
    }

    public static int getObjectCounter() {
        return MyRectangle.instanceCount;
    }

    public static MyRectangle duplicate(MyRectangle myRectangle) {
        return new MyRectangle(myRectangle.getXCoordinate(), myRectangle.getXCoordinate(), myRectangle.getWidth(), myRectangle.getHeight());
    }
}

