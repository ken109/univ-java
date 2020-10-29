package chap12;

import chap05.HTurtle;
import tg.TurtleFrame;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierExample extends TurtleFrame {
    CyclicBarrierExample(int n) {
        ExecutorService executor = Executors.newCachedThreadPool();
        final CyclicBarrier cb = new CyclicBarrier(n);
        for (int ii = 0; ii < n; ii++) {
            int i = ii;
            executor.execute(() -> {
                HTurtle m = new HTurtle(100, 50 * (i + 1), 90);
                add(m);
                try {
                    while (true) {
                        m.speed((int) (Math.random() * 40)); // 毎回スピードを変える
                        m.polygon(i + 3, 20);    // 多角形を描いて
                        m.fd(20);              // 場所を移動して
                        cb.await();      // 同期をとる 
                    }
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            });
        }
        executor.shutdown();
    }

    public static void main(String[] args) {
        new CyclicBarrierExample(5);
        new CyclicBarrierExample(3);
    }
}