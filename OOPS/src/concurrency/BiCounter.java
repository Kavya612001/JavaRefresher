package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounter {

    int i;
    int j;

    Lock lockForI = new ReentrantLock();
    Lock lockForJ = new ReentrantLock();

    public void incrementI() {
        // Get lock
        lockForI.lock();
        i++;
        // Release lock
        lockForI.unlock();
    }

    public int getI() {
        return i;
    }

    public void incrementJ() {
        // Get lock
        lockForJ.lock();
        j++;
        // Release lock
        lockForJ.unlock();
    }

    public int getJ() {
        return j;
    }
}
