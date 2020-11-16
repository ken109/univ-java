package kadai.kadai7;

import tg.Turtle;
import tg.TurtleFrame;

public class Kadai7_1 {
    public static void main(String[] args) {
        Turtle m;
        TurtleFrame f = new TurtleFrame();
        int d = 50;

        if (args.length > 0) {
            m = new STurtle();
        } else {
            m = new Turtle();
        }

        f.add(m);

        if (m instanceof STurtle) {
            int n = Integer.parseInt(args[0]);
            for (int i = 0; i < n; i++) {
                ((STurtle) m).drawStar(d);
                if (i != n - 1) {
                    m.up();
                    m.rt(90);
                    m.fd(d);
                    m.lt(90);
                    m.down();
                }
            }
        } else {
            for (int i = 0; i < 5; i++) {
                m.fd(d);
                m.rt(144);
            }
        }
    }
}
