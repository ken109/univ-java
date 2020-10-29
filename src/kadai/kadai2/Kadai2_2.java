package kadai.kadai2;

import javafx.scene.paint.Color;
import tg.Turtle;
import tg.TurtleFrame;

import java.util.Scanner;

public class Kadai2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TurtleFrame f = new TurtleFrame();
        Turtle m = new Turtle();
        f.add(m);

        double x, y, d, a;
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        d = scanner.nextDouble();
        a = scanner.nextDouble();

        m.up();
        m.moveTo(x, y);
        m.lt(m.getAngle());
        m.down();
        m.setColor(Color.rgb(0, 0, 255));
        m.fd(d);
        m.lt(90);
        m.fd(d / 2);
        m.rt(180 - a);
        m.fd(d);
        m.rt(a);
        m.fd(2 * d);
        m.rt(a);
        m.fd(d);
        m.rt(180 - a);
        m.fd(d / 2);
        m.lt(90);
        m.fd(d);
    }
}
