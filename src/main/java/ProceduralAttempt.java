import processing.core.PApplet;

public class ProceduralAttempt extends PApplet {
    private final float ballSpeed = 1;
    private final int ballHeight = 10;
    private final int ballWidth = 10;
    private float firstBallXCoordinate, secondBallXCoordinate, thirdBallXCoordinate, forthBallXCoordinate  = 1;
    private final int screenHeight = 720, screenWidth = 720;
    private final float firstBallYCoordinate = (float) screenHeight / 5;
    private final float secondBallYCoordinate = 2 * firstBallYCoordinate;
    private final float thirdBallYCoordinate = 3 * firstBallYCoordinate;
    private final float forthBallYCoordinate = 4 * firstBallYCoordinate;

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
        ellipse(firstBallXCoordinate, firstBallYCoordinate, ballHeight, ballWidth);
        firstBallXCoordinate += ballSpeed;
        ellipse(secondBallXCoordinate, secondBallYCoordinate, ballHeight, ballWidth);
        secondBallXCoordinate += 2 * ballSpeed;
        ellipse(thirdBallXCoordinate, thirdBallYCoordinate, ballHeight, ballWidth);
        thirdBallXCoordinate += 3 * ballSpeed;
        ellipse(forthBallXCoordinate, forthBallYCoordinate, ballHeight, ballWidth);
        forthBallXCoordinate += 4 * ballSpeed;
    }

    public static void main(String[] args) {
        PApplet.main("ProceduralAttempt");
    }
}
