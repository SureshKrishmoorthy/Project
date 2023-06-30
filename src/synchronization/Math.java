package synchronization;

public class Math {
    synchronized void math(int n){
        try {
            wait(1000);
        } catch (InterruptedException e) {
        }
        for (int i=1;i<=10;i++){
            System.out.println(i*n+" ");
        }
        notify();
    }
}
class Thread5 extends Thread{
    Math m;
    Thread5(Math m){
        this.m=m;
    }
    @Override
    public void run() {
        m.math(2);
    }
}
class Thread6 extends Thread{
    Math m;
    Thread6(Math m){
        this.m=m;
    }
    @Override
    public void run() {
        m.math(3);
    }
}
class Thread7 extends Thread{
    Math m;
    Thread7(Math m){
        this.m=m;
    }
    @Override
    public void run() {
        m.math(4);
    }
}
class Thread8 extends Thread{
    Math m;
    Thread8(Math m){
        this.m=m;
    }
    @Override
    public void run() {
        m.math(5);
    }
}