package kadai.kadai3;

import tg.*;

public class Kadai3_2 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();
        Turtle m = new Turtle();
        f.add(m);
        for (int j = 3; j <= 10; j++) {
            m.fd(50);
            m.rt(45);
            for (int i = 0; i < j; i++) {
                m.fd(50);
                m.lt(360 / j);
            }
        }
    }
}
