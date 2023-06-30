package VariableArguments;

public class VarArgs {
    static void method2(int a,String... b){
        System.out.println(a);
        for (String s:b) {
            System.out.println(s);
        }
        method3(b);
    }
    static void method3(String[] s){
        for (String string:
             s) {
            System.out.println(string);
        }
    }

    public static void main(String[] args) {
        method2(6,"Java","JavaScript","SpringBoot");
        method2(5);
    }
}
