package synchronization;

public class JoinMethodCheck implements Runnable{
    public void task(){
        System.out.println("Thread 1"+Thread.currentThread().getName());
        System.out.println("Thread 2");
        System.out.println("Thread 3");
    }

    @Override
    public void run() {
        task();
    }
}
class Checker{
    public static void main(String[] args) throws InterruptedException {
        JoinMethodCheck jm=new JoinMethodCheck();
        Thread t1=new Thread(jm,"Suresh");
        Thread t2=new Thread(jm,"Krish");
        Thread t3=new Thread(jm,"java");

        t1.start();
        try {
            t3.join();
        } catch (InterruptedException e) {

        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {

        }
        t3.start();

    }
}
