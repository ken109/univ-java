package kadai.kadai3;

import tg.*;

public class Kadai3_3 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();
        Turtle m = new Turtle();
        f.add(m);
        for (int j = 0; j < 8; j++) {
            m.fd(50);
            m.rt(45);
            for (int i = 0; i < j + 3; i++) {
                m.fd(50);
                m.lt(360 / (double) (j + 3));
            }
        }
    }
}
