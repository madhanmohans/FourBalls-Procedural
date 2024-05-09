import processing.core.PApplet;

public class ObjectOrientedAttempt extends PApplet {
    private final int ballSpeed = 1;
    private final int ballHeight = 10;
    private final int ballWidth = 10;
    private float firstBallXCoordinate, secondBallXCoordinate, thirdBallXCoordinate, forthBallXCoordinate  = 1;
    private final int screenHeight = 720, screenWidth = 720;
    private final float firstBallYCoordinate = (float) screenHeight / 5;
    private final float secondBallYCoordinate = 2 * firstBallYCoordinate;
    private final float thirdBallYCoordinate = 3 * firstBallYCoordinate;
    private final float forthBallYCoordinate = 4 * firstBallYCoordinate;
    private final int firstBallSpeed = ballSpeed;
    private final int secondBallSpeed = 2 * ballSpeed;
    private final int thirdBallSpeed = 3 * ballSpeed;
    private final int forthBallSpeed = 4 * ballSpeed;

    @Override
    public void settings() {
        super.settings();
        size(screenWidth, screenHeight);
    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {

    }

    public static void main(String[] args) {
        PApplet.main("ObjectOrientedAttempt");
    }
}
