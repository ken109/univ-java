package kadai.kadai9;

import tg.Turtle;

public class MultiTurtle extends Turtle implements Runnable {
    public MultiTurtle(double x, double y, double ia) {
        super(x, y, ia);
    }

    @Override
    public void run() {
        for (int j = 0; j < 6; j++) {
            fd(10);
            rt(360 / 6.0);
        }
    }
}
