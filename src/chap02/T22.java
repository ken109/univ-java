package chap02;

import tg.Turtle;
import tg.TurtleFrame;

public class T22 {
    public static void main(String[] args) {
        double x = 300.0, y = 200.0, d = 100.0;             // double 型の変数を用意
        TurtleFrame f = new TurtleFrame(700.0, 500.0);  //引数のあるコンストラクタ呼出し
        Turtle m = new Turtle(x, y, 180.0);
        Turtle m1 = new Turtle(x + d, y + d, 0.0);
        javafx.scene.paint.Color c = new javafx.scene.paint.Color(0.8, 0.0, 0.0, 1.0);    //赤色
        m1.setColor(c);      //m1 の色を作成した色オブジェクト)に指定
        f.add(m);
        f.add(m1);
        m.fd(d);
        m1.fd(d);
        m.lt(90.0);
        m1.lt(90.0);
        d = d / 2;           //d の値を d/2 に変更   
        m.fd(d);
        m1.fd(d);
        m1.moveTo(m);
    }
}
