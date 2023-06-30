package Casting;

public class Pencil {
    void write(){
        System.out.println("writing");
    }

    public static void main(String[] args) {
        var ref=new Pencil();
        ref.write();
    }
}
