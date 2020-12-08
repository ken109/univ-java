package kadai.kadai10;

import tg.Turtle;

public class MultiTurtle extends Turtle implements Runnable {
    private final double[] graph;

    public MultiTurtle(double[] graph) {
        this.graph = graph;
    }

    public void run() {
        up();

        moveTo(graph[0] * 4 + 200, graph[1] * 4 + 200);
        down();
        for (int j = 0; j < graph.length; j += 2) {
            moveTo(graph[j] * 4 + 200, graph[j + 1] * 4 + 200);
        }
        up();
    }
}
