package kadai.kadai5;

import chap05.HTurtle;
import tg.TurtleFrame;

public class Kadai5_1 {
    private static final int LENGTH = 10;

    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();
        HTurtle[] turtles = new HTurtle[LENGTH];

        for (int i = 0; i < LENGTH; i++) {
            turtles[i] = new HTurtle(i * 50 + 25, 150, 0);
            f.add(turtles[i]);
        }

        for (int i = 0; i < LENGTH; i++) {
            turtles[i].polygon(6, 10);
        }
    }
}
