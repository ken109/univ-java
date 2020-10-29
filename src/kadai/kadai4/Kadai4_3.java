package kadai.kadai4;

import tg.TurtleFrame;

public class Kadai4_3 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();
        MyTurtle m = new MyTurtle();

        f.add(m);

        m.ppolygon(8, 5, 20);

        m.up();
        m.rt(90);
        m.fd(100);
        m.lt(90);
        m.down();

        m.flower(20, 5, 6);

        m.up();
        m.rt(90);
        m.fd(100);
        m.lt(90);
        m.down();

        m.houses(3, 50, 70);
    }
}
