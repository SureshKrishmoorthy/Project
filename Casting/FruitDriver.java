package Casting;

public class FruitDriver {
    public static void main(String[] args) {
        Fruit ref=new Apple();
        ref.calorie();
        ref.origin();
        Fruit ref1=new Orange();
        ref1.origin();
        ref1.calorie();
        originCheck(ref);
        originCheck(ref1);
    }
    public static void originCheck(Fruit ref){
        if(ref instanceof  Apple){
            Apple apple=(Apple) ref;
            apple.origin();
        }else {
            Orange orange=(Orange) ref;
            orange.origin();
        }
    }
}
