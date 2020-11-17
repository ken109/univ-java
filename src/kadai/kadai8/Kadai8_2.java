package kadai.kadai8;

import tg.TurtleFrame;

public class Kadai8_2 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();
        AbstTurtle[] hm = new AbstTurtle[2];
        hm[0] = new DrawHouse2();
        f.add(hm[0]);
        hm[1] = new DrawStar2();
        f.add(hm[1]);
        while (true) {
            int n = (int) (Math.random() * hm.length);
            int x = (int) (Math.random() * 400);
            int y = (int) (Math.random() * 400);
            hm[n].draw(x, y);
        }
    }
}
