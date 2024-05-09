import processing.core.PApplet;

import java.util.ArrayList;
import java.util.Arrays;

public class ObjectOrientedAttempt extends PApplet {

    private final int screenHeight = 720, screenWidth = 720;

    private float firstBallXCoordinate, secondBallXCoordinate, thirdBallXCoordinate, forthBallXCoordinate  = 1;

    private final float firstBallYCoordinate = (float) screenHeight / 5;
    private final float secondBallYCoordinate = 2 * firstBallYCoordinate;
    private final float thirdBallYCoordinate = 3 * firstBallYCoordinate;
    private final float forthBallYCoordinate = 4 * firstBallYCoordinate;

    private final int firstBallSpeed = 1;
    private final int secondBallSpeed = 2 * firstBallSpeed;
    private final int thirdBallSpeed = 3 * firstBallSpeed;
    private final int forthBallSpeed = 4 * firstBallSpeed;

    private final ArrayList<Ball> fourBalls = new ArrayList<Ball>(Arrays.asList(
            new Ball(firstBallXCoordinate, firstBallYCoordinate, firstBallSpeed),
            new Ball(secondBallXCoordinate, secondBallYCoordinate, secondBallSpeed),
            new Ball(thirdBallXCoordinate, thirdBallYCoordinate, thirdBallSpeed),
            new Ball(forthBallXCoordinate, forthBallYCoordinate, forthBallSpeed)
    ));

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
        for (Ball ball : fourBalls) {
            ellipse(ball.getXCoordinate(), ball.getYCoordinate(), ball.getSize(), ball.getSize());
            ball.moveBallFromLeftToRightWithTheGivenSpeed();
        }
    }

    public static void main(String[] args) {
        PApplet.main("ObjectOrientedAttempt");
    }
}
