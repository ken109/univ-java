package chap12;

import chap05.HTurtle;
import tg.Turtle;
import tg.TurtleFrame;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TurtleRace extends TurtleFrame {
    ExecutorService executor = Executors.newCachedThreadPool();
    ArrayList<Callable<Integer>> p = new ArrayList<>();

    TurtleRace(int num) {
        for (int i = 0; i < num; i++) {
            int ii = i;

            p.add(() -> {
                Turtle m = new HTurtle(0, (ii + 1) * 50, 90);
                add(m);
                int sp = (int) ((Math.random() + 1) * 20);
                m.speed(sp);
                m.fd(400);
                return sp;
            });

/*  教科書では上記のようになっているが，こちらの方が動きは面白い。
            p.add(()->{
                Turtle m = new HTurtle(0, (ii+1)*50, 90);    add(m);
                double v = 1;
                while(m.getX()<400){
                    v = Math.max(v + Math.random()- 0.5, 0);
                    m.fd(v);
                }
                return ii;
            });
*/

        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        TurtleRace a1 = new TurtleRace(5);
        TurtleRace a2 = new TurtleRace(3);
        TurtleRace a3 = new TurtleRace(7);
        a1.start();
        a2.start();
        a3.start();
    }

    void start() throws InterruptedException, ExecutionException {
        System.out.print(executor.invokeAny(p));
//        executor.invokeAll(p);
        executor.shutdown();
    }
}