package synchronization;

public class Note {
    int num;
    boolean value=false;
    public synchronized void put(int num){
        while (value){
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        System.out.println("Put:" +num);
        this.num=num;
        value=true;
        notify();
    }
    public synchronized void get(){
        while (!value){
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        System.out.println("Get:"+num);
        value=false;
        notify();
    }
}
