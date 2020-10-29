package kadai.kadai2;

import tg.Turtle;
import tg.TurtleFrame;

public class Kadai2_1 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();
        Turtle m = new Turtle();
        f.add(m);
        for (int i = 0; i < 5; i++) {
            m.fd(100);
            m.rt(144);
        }
    }
}
