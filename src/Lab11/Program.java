package Lab11;

public class Program {
    public static void main(String[] args){
        System.out.println("##Exercise1");
        threadCounter();

        System.out.println("##Exercise2");
        threadCounterWithState();

        System.out.println("##Exercise3");
        Counter counter = new Counter();
        startCounter(counter);
        System.out.println(counter.getCount());

        System.out.println("##Exercise4");
        startTreadNames();
    }

    public static void threadCounter(){
        for (int i = 0; i < 10; i++){
            new MyCounter().start();
        }
    }

    public static void threadCounterWithState(){
        for (int i = 0; i < 10; i++){
            MyCounter myCounter = new MyCounter();
            System.out.println(myCounter.getState());
            myCounter.start();
            System.out.println(myCounter.getState());

            try {
                myCounter.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(myCounter.getState());
        }
    }

    public static void startCounter(Counter counter){

        for (int i =0; i < 100; i++){
            Thread t = new Thread (new CounterThread(counter));
            t.start();
            try {
                t.join();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void startTreadNames(){
        Object obj = new Object();
        NameThread myThread1 = new NameThread(obj);
        NameThread myThread2 = new NameThread(obj);
        myThread1.start();
        myThread2.start();
    }
}
