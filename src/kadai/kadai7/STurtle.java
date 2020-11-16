package kadai.kadai7;

import tg.Turtle;

public class STurtle extends Turtle {
    public void drawStar(int n) {
        for (int i = 0; i < 5; i++) {
            fd(n);
            rt(144);
        }
    }
}
