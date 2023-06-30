package synchronization;

public class Table {
    static synchronized void table(int n){
        for (int i=1;i<=10;i++){
            System.out.println(i*n);
        }
    }
}
class Thread1 extends Thread{
    @Override
    public void run() {
        Table.table(2);
    }
}
class Thread2 extends Thread{
    @Override
    public void run() {
        Table.table(3);
    }
}
class Thread3 extends Thread{
    @Override
    public void run() {
        Table.table(4);
    }
}
class Thread4 extends Thread{
    @Override
    public void run() {
        Table.table(5);
    }
}