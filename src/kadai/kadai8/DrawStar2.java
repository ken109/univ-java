package kadai.kadai8;

public class DrawStar2 extends AbstTurtle {
    double size = 10;

    @Override
    void draw(int x, int y) {
        up();
        moveTo(x, y, 18);
        down();
        for (int i = 0; i < 5; i++) {
            fd(size);
            rt(144);
        }
        size += 10;
    }
}
