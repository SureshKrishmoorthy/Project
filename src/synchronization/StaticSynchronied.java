package synchronization;

public class StaticSynchronied implements Runnable{
    static Thread t1;static StaticSynchronied ref;
     int num=0;
    static synchronized void method(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        for (int i=1;i<10;i++){
            System.out.print(1);
        }

    }
     void method2(){
        for (int i=1;i<10;i++) {
            System.out.println(num++);
        }
    }
     void method3(){
        for (int i=1;i<10;i++){
            System.out.println(num++);
        }
    }
     void method4(){
        for (int i=1;i<10;i++){
            System.out.println(num++);
        }
    }


    public static void main(String[] args) throws InterruptedException {
        ref=new StaticSynchronied();
        StaticSynchronied ref1=new StaticSynchronied();
        t1=new Thread(ref);

        Thread t2=new Thread(ref1);
        t1.start();
        t2.start();
        ref.method();

        Thread.sleep(1000);
        System.out.println("*"+ref.num+"*");
        System.out.println("*"+ref1.num+"*");

    }

    @Override
    public void run() {
        method2();

        method3();
        method4();
    }
}
