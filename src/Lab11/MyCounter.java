package Lab11;

public class MyCounter extends Thread {
    @Override
    public void run(){
        super.run();
        for (int i = 0; i < 100; i++){
            System.out.println(i);
        }
    }
}
