package kadai.kadai9;

public class SLock {
    int p, now = 0;

    public SLock(int p) {
        this.p = p;
    }

    synchronized void synchro() {
        if (now == p - 1) {
            now = 0;
            notifyAll();
        } else {
            now++;
            try {
                wait();
            } catch (InterruptedException ignored) {

            }
        }
    }
}
