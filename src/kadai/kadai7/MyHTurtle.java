package kadai.kadai7;

import kadai.kadai4.MyTurtle;
import tg.TurtleFrame;

public class MyHTurtle extends MyTurtle {
    public static void main(String[] args) {
        MyHTurtle m = new MyHTurtle();
        TurtleFrame f = new TurtleFrame();

        f.add(m);

        m.up();
        m.moveTo(200, 350, 0);
        m.down();
        m.house(20);

        m.up();
        m.moveTo(220, 250, 0);
        m.down();
        m.houses(3, 40, 10);
    }

    @Override
    public void house(double s) {
        super.house(s);
        up();
        rt(90);
        fd(s / 4);
        lt(90);
        fd(s / 4);

        down();
        for (int i = 0; i < 4; i++) {
            fd(s / 2);
            rt(90);
        }
        up();

        fd(s / 4);
        rt(90);

        down();
        fd(s / 2);
        up();

        lt(90);
        for (int i = 0; i < 2; i++) {
            fd(s / 4);
            lt(90);
        }

        down();
        fd(s / 2);
        up();

        fd(s / 4);
        rt(90);
        fd(s / 2);
        rt(90);
        down();
    }
}
