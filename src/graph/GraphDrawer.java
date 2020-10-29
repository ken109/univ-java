package graph;

import tg.Turtle;
import tg.TurtleFrame;

public class GraphDrawer {
    double a = 3.5;              // fun のパラメータ
    double width = 400;            //画面の横幅
    TurtleFrame f;
    GTurtle m;
    GraphDrawer() {                //コンストラクター
        f = new TurtleFrame(width, width);
        m = new GTurtle();
        f.add(m);
        f.addMesh();
    }

    public static void main(String[] args) { //main メソッド
        GraphDrawer gd = new GraphDrawer();
        gd.start();
    }

    double fun(double x) {     //描画する関数
        return a * x * (1 - x);
    }

    void start() {                 //処理の本体
        m.drawGraph();
    }

    class GTurtle extends Turtle {   //内部クラスGTurtle
        void drawGraph() {             // グラフ描画メソッド
            up();
            dMoveTo(0, fun(0));
            down();
            for (double x = 0; x < 1; x += 1 / width) {
                dMoveTo(x, fun(x));
            }
        }                   // グラフ内座標を用いた移動メソッド

        void dMoveTo(double x, double y) {
            moveTo(x * width, (1 - y) * width);
        }
    }
}
