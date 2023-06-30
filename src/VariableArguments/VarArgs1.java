package VariableArguments;

public class VarArgs1 {
    static void method1(int... a){
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println(a[3]);
    }
    public static void main(String[] args) {
        method1(1,2,3,45,5,67,7);

    }
}
