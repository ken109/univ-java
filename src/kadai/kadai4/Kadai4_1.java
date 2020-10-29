package kadai.kadai4;

import tg.TurtleFrame;

public class Kadai4_1 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();
        MyTurtle m = new MyTurtle();
        f.add(m);

        m.houses(5, 30, 40);
    }
}
