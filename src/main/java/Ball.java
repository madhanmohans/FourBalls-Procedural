public class Ball {
    private final int size = 10;
    private float xCoordinate;
    private float yCoordinate;
    private int speed;

    Ball(float xCoordinate, float yCoordinate, int speed) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.speed = speed;
    }
    public void moveBallFromLeftToRightWithTheGivenSpeed() {
        this.xCoordinate += speed;
    }
    public float getXCoordinate() {
        return xCoordinate;
    }
    public float getYCoordinate() {
        return yCoordinate;
    }
    public float getSize() {
        return size;
    }
}