package synchronization;

public class Synchronization extends Thread{
    static int count;
    @Override
    public void run() {
        table();
//        table1();
    }
    void table(){
        synchronized (this){
            for (int i=0;i<10000;i++){
                count++;
            }
        }
        System.out.println(count);
    }
    void table1(){
        for (int i=0;i<10000;i++){
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Synchronization t0=new Synchronization();
        Synchronization t1=new Synchronization();
        t0.start();
        t1.start();
    }
}
