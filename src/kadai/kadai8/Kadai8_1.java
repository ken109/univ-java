package kadai.kadai8;

import tg.Turtle;
import tg.TurtleFrame;

public class Kadai8_1 {
    public static void main(String[] args) {
        Turtle m = new Turtle();
        TurtleFrame f = new TurtleFrame();
        f.add(m);

        for (int i = 0; i < 4; i++) {
            try {
                m.fd(Integer.parseInt(args[i]));
                m.rt(90);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println((i + 1) + "番目の引数がありません");
            } catch (NumberFormatException e) {
                System.out.println((i + 1) + "番目の引数が文字です");
            }
        }
    }
}
