package Lab11;

public class CounterThread implements Runnable{
    Counter counter;
    public CounterThread(Counter counter){
        this.counter = counter;
    }

    public void run(){
        synchronized (counter){
            for (int i = 0; i < 1000; i++){
                counter.increment();
            }
        }
    }
}
