import processing.core.PApplet;

public class ProceduralAttempt extends PApplet {
    private final float speed = 1;
    private float firstBall = speed;
    private float secondBall = speed;
    private float thirdBall = speed;
    private float forthBall = speed;

    private final int height = 12, width = 10;

    @Override
    public void settings() {
        super.settings();
        size(width, height);
    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {
        ellipse(firstBall, (float)height / 5, 100, 100);
    }

    public static void main(String[] args) {
        PApplet.main("ProceduralAttempt");
    }
}
