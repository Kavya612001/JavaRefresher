package concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithAtomicInteger {

    private AtomicInteger i = new AtomicInteger();
    private  AtomicInteger j = new AtomicInteger();

    Lock lockForI = new ReentrantLock();
    Lock lockForJ = new ReentrantLock();

    public void incrementI() {
        // Get lock
//        lockForI.lock();
//        i++;
        i.incrementAndGet();
        // Release lock
//        lockForI.unlock();
    }

    public int getI() {
//        return i;
        return i.get();
    }

    public void incrementJ() {
        // Get lock
//        lockForJ.lock();
//        j++;
        j.incrementAndGet();
        // Release lock
//        lockForJ.unlock();
    }

    public int getJ() {
//        return j;
        return j.get();
    }
}
