package kadai.kadai8;

public class DrawHouse2 extends AbstTurtle {
    double size = 10;

    @Override
    void draw(int x, int y) {
        up();
        moveTo(x, y, 0);
        down();
        house(size);
        size += 10;
    }
}
