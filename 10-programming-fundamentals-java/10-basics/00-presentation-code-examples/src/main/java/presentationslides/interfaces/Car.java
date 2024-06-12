package presentationslides.interfaces;

public class Car implements Drivable {

    private static final int MOVE_X_AMOUNT = 5;
    private static final int ACCELERATION = 10;

    private int xPosition;
    private int speed;

    @Override
    public int moveLeft() {
        xPosition -= MOVE_X_AMOUNT;
        return xPosition;
    }

    @Override
    public int moveRight() {
        xPosition += 5;
        return xPosition;
    }

    @Override
    public void brake() {
        speed = 0;
    }

    @Override
    public void accelerate() {
        speed += ACCELERATION;
    }
}
