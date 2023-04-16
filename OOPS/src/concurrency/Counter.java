package concurrency;

public class Counter {

    int i;

    public void increment() {
        // Get lock
        i++;
        // Release lock
    }

    public int getI() {
        return i;
    }
}
