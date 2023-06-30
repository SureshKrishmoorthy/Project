package synchronization;

public class MathDriver {
    public static void main(String[] args) {
        Math m=new Math();
        Thread5 t5=new Thread5(m);
        Thread6 t6=new Thread6(m);
        Thread7 t7=new Thread7(m);
        Thread8 t8=new Thread8(m);
        t5.start();
        t6.start();
        t7.start();
        t8.start();
    }
}
