package synchronization;

public class DriverNote {
    public static void main(String[] args) {
        Note note=new Note();
        new Producer(note);
        new Consumer(note);

    }
}
