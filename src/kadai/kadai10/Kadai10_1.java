package kadai.kadai10;

import tg.TurtleFrame;

public class Kadai10_1 {
    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame();

        for (double[] graph : MultiTurtle.turtleFig) {
            MultiTurtle m = new kadai.kadai10.MultiTurtle(graph);
            f.add(m);
            (new Thread(m)).start();
        }
    }
}
