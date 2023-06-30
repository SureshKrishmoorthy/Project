package interfacerpractice;

import org.w3c.dom.ls.LSOutput;

public interface Interface {
    void draw();
    int input=123;
    interface Interface1{

        void cook();
        interface Interface2{
            void speak();
        }


    }
}
class Table implements Interface{

    public static void main(String[] args) {
        Interface i=new Interface() {
            @Override
            public void draw() {

            }
        };
        System.out.println(i.input);
    }

    @Override
    public void draw() {

    }


}
class Chair{


    interface inter{
        int a=12;
        void draw();
    }

    public static void main(String[] args) {
        inter i=new inter(){

            @Override
            public void draw() {

            }
        };
    }

}