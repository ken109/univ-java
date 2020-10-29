package kadai.kadai4;

import tg.Turtle;

public class DrawTurtle extends Turtle {
    public void drawMPolygon(int s, int n, int p) {
        for (int j = 0; j < n; j++) {
            fd(s);
            rt(360 / (double) n);
            for (int i = 0; i < j + p; i++) {
                fd(s);
                lt(360 / (double) (j + p));
            }
        }
    }
}
