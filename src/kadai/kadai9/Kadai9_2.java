package kadai.kadai9;

import tg.TurtleFrame;

public class Kadai9_2 {
    private static final int POLYGON_LENGTH = 3;
    private static final int QUANTITY = 6;

    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();

        SLock sl = new SLock(POLYGON_LENGTH);

        for (int i = 0; i < 3; i++) {
            SPolygon m = new SPolygon(0, i * 100, 90, i + 4, 50, sl, QUANTITY);
            f.add(m);
            (new Thread(m)).start();
        }
    }
}
