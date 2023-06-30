package synchronization;

public class Bank implements Runnable{
    static int balance=5000;

    @Override
    public void run() {
        withdraw(5000);
    }
    public static synchronized void withdraw(int amount){
        if(amount<=balance){
            System.out.println(Thread.currentThread().getName()+":"+amount);
            balance-=amount;
        }
        else
            System.out.println("Insufficient Balance");
    }

    public static void main(String[] args) {
        Bank ref=new Bank();
        Thread t1=new Thread(ref);
        Thread t2=new Thread(ref);
        Bank ref1=new Bank();
        Thread t3=new Thread(ref1);
        Thread t4=new Thread(ref1);
        t1.setName("suresh");
        t2.setName("krish");
        t3.setName("Suresh");
        t4.setName("Krish");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
