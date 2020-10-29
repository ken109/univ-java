package kadai.kadai3;

import tg.*;

public class Kadai3_1 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();
        Turtle m = new Turtle();
        f.add(m);
        for (int i = 10; i <= 100; i += 10) {
            m.fd(i);
            m.rt(72);
        }
    }
}
