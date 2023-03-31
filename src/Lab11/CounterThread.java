package Lab11;

import java.util.concurrent.CountDownLatch;

public class CounterThread implements Runnable{
    private Counter counter;
    private CountDownLatch latchCounter;

    public CounterThread(Counter counter, CountDownLatch latchCounter){
        this.counter = counter;
        this.latchCounter = latchCounter;
    }

    public void run(){
        synchronized (counter){
            for (int i = 0; i < 1000; i++){
                counter.increment();
            }
            latchCounter.countDown();
        }
    }
}
