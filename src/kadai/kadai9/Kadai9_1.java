package kadai.kadai9;

import tg.TurtleFrame;

public class Kadai9_1 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame(600, 300);

        for (int i = 0; i < 10; i++) {
            MultiTurtle mt = new MultiTurtle(i * 50 + 25, 150, 0);
            f.add(mt);
            (new Thread(mt)).start();
        }
    }
}
