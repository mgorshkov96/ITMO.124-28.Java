package Lab11;

public class NameThread extends Thread{
    private Object obj;

    public NameThread(Object obj){
        this.obj = obj;
    }

    @Override
    public void run(){
        synchronized (obj){
            while (true){
                obj.notify();
                System.out.println(this.getName());
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
