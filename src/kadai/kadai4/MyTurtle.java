package kadai.kadai4;

import chap05.HTurtle;

public class MyTurtle extends HTurtle {
    public void houses(int n, double s, double w) {
        for (int i = 0; i < n; i++) {
            house(s);
            up();
            rt(90);
            fd(w + s);
            lt(90);
            down();
        }
    }

    public void ppolygon(int n, int m, int s) {
        for (int i = 0; i < n; i++) {
            polygon(m, s);
            fd(s);
            lt(360.0 / n);
        }
    }

    public void flower(int s, int n, int r) {
        for (int i = 0; i < r; i++) {
            polygon(n, s);
            lt(360.0 / r);
        }
        lt(180);
        fd(s * 4);
        for (int i = 0; i < 2; i++) {
            rt(120);
            polygon(2, s * 2);
        }
        lt(60);
    }
}
