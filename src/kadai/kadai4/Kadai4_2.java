package kadai.kadai4;

import tg.TurtleFrame;

public class Kadai4_2 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();
        DrawTurtle m = new DrawTurtle();
        f.add(m);
        m.drawMPolygon(100, 10, 5);
    }
}
