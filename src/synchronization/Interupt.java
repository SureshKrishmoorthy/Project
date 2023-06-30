package synchronization;

public class Interupt extends Thread{
    @Override
    public void run() {
        try{
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
//                Thread.yield();
            Thread.sleep(100);
        }


        //throwable type of object
    } catch (InterruptedException e) {
            System.out.println("Thread terminated");
        }

    }

    public static void main(String[] args) {
        Interupt ref=new Interupt();
        Interupt ref1=new Interupt();
        ref.start();
//        ref1.start();
        ref.interrupt();
    }
}
