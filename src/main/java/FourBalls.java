import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int WIDTH_BALL1 = 0;
    int WIDTH_BALL2 = 0;
    int WIDTH_BALL3 = 0;
    int WIDTH_BALL4 = 0;

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawBall1();
        drawBall2();
        drawBall3();
        drawBall4();
    }

    private void drawBall1() {
        ellipse(WIDTH_BALL1++, HEIGHT/5, DIAMETER, DIAMETER);
    }

    private void drawBall2() {
        ellipse(WIDTH_BALL2, HEIGHT/5*2, DIAMETER, DIAMETER);
        WIDTH_BALL2+=2;
    }

    private void drawBall3() {
        ellipse(WIDTH_BALL3, HEIGHT/5*3, DIAMETER, DIAMETER);
        WIDTH_BALL3+=3;
    }

    private void drawBall4() {
        ellipse(WIDTH_BALL4, HEIGHT/5*4, DIAMETER, DIAMETER);
        WIDTH_BALL4+=4;
    }

    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }
}
