package synchronization;

public class Producer implements Runnable{
    Note note;

    public Producer(Note note) {
        this.note = note;
        Thread t1=new Thread(this,"Producer");
        t1.start();
    }

    @Override
    public void run() {
        int i=0;
        while (i<=10){
            note.put(i++);
        }
    }
}
class Consumer implements Runnable{
    Note note;

    public Consumer(Note note) {
        this.note = note;
        Thread t1=new Thread(this,"Consumer");
        t1.start();
    }

    @Override
    public void run() {
        int i=0;
        while (i<=10){
            note.get();
            i++;
        }
    }
}
