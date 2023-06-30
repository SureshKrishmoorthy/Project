package synchronization;

public class Methods extends Thread{
    @Override
    public void run() {
        method();
    }

    synchronized void method(){
        for (int i=0;i<=10;i++){
            System.out.println(i+": "+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Methods m1=new Methods();
        Methods m2=new Methods();
        m1.start();
        m2.start();
        try {
            m1.join();
        } catch (InterruptedException e) {

        }
    }
}
