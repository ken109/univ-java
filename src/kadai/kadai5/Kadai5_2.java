package kadai.kadai5;

import chap05.HTurtle;
import javafx.scene.paint.Color;
import tg.TurtleFrame;

public class Kadai5_2 {
    private static final int LENGTH = 10;

    public static void main(String[] args) {
        int[] size = {20, 40, 20, 60};
        int[] n = {7, 5, 3, 4, 6};
        Color[] c = {Color.ORANGE, Color.RED, Color.BLUE};

        TurtleFrame f = new TurtleFrame();
        HTurtle[] turtles = new HTurtle[LENGTH];

        for (int i = 0; i < LENGTH; i++) {
            turtles[i] = new HTurtle(i * 50 + 25, 150, 0);
            f.add(turtles[i]);
            turtles[i].setColor(c[i % c.length]);
        }

        for (int i = 0; i < LENGTH; i++) {
            turtles[i].polygon(n[i % n.length], size[i % size.length]);
        }
    }
}
