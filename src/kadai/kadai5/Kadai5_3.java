package kadai.kadai5;

import tg.Turtle;
import tg.TurtleFrame;

public class Kadai5_3 {
    public static void main(String[] args) {
        double[][] graphs = Turtle.turtleFig;

        TurtleFrame f = new TurtleFrame();
        Turtle turtle = new Turtle();
        f.add(turtle);
        turtle.up();

        for (double[] graph : graphs) {
            turtle.moveTo(graph[0] * 4 + 200, graph[1] * 4 + 200);
            turtle.down();
            for (int j = 0; j < graph.length; j += 2) {
                turtle.moveTo(graph[j] * 4 + 200, graph[j + 1] * 4 + 200);
            }
            turtle.up();
        }
    }
}
