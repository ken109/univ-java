package kadai.kadai10;

import tg.Turtle;
import tg.TurtleFrame;

public class GraphTurtle extends Turtle {
    private static final double frameScale = 400;

    public double xArea = 10;
    public double xStep = 1;

    private double calcY(double x, double a, double b) {
        return a * Math.pow(x, 2) + b;
    }

    public void drawGraph(double a, double b) {
        up();
        double x = -xArea;
        moveTo(x + frameScale / 2, -calcY(x, a, b) + frameScale / 2);
        down();

        while (x <= xArea) {
            moveTo(x + frameScale / 2, -calcY(x, a, b) + frameScale / 2);
            x += xStep;
        }
    }

    public void drawGraph(double a) {
        drawGraph(a, 0);
    }

    public void drawGraph() {
        drawGraph(1);
    }

    public static void main(String[] args) {
        TurtleFrame f = new TurtleFrame(frameScale, frameScale);
        GraphTurtle m = new GraphTurtle();

        f.add(m);

        m.drawGraph();
    }
}
