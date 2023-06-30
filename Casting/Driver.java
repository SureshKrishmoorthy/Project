package Casting;

public class Driver {
    public static void main(String[] args) {
        Parent ref=new Child();
        ref.speak();
        ref.walk();
        Child ref1= (Child) ref;
        ref1.jog();
        Parent ref2=new GrandChild();
        ref2.speak();
        Child ref3= (Child) ref2;
        ref3.jog();
        ref3.speak();
        ref3.walk();
//        Child ref6=(Child) new Parent();//Class-cast exception
//        ref.walk();

//        Parent ref3=new Parent();
//        Child ref4=(Child)ref3;
//        ref4.speak();    ===>Class cast Exception
//        ref4.jog();
//        ref4.walk();
    }
}
