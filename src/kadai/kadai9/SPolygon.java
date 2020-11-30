package kadai.kadai9;

import chap05.HTurtle;

public class SPolygon extends HTurtle implements Runnable {
    int p, n;
    double s;
    SLock sl;

    public SPolygon(double x, double y, double angle, int p, double s, SLock sl, int n) {
        super(x, y, angle);
        this.p = p;
        this.s = s;
        this.sl = sl;
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            speed((int) (Math.random() * 40));
            polygon(p, s);
            fd(s);
            sl.synchro();
        }
    }
}
