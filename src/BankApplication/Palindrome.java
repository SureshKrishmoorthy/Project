package BankApplication;

public class Palindrome {
    public static void main(String[] args) {
        String str="hi racecar madam wow";
        String[] array=str.split(" ");
        for(String s:array)
            m1(s);
    }
    static void m1(String s){
        String str=" ";
        StringBuilder ref=new StringBuilder(s);
        StringBuilder rev=new StringBuilder(ref.reverse());
        if(ref.equals(rev))
            str= String.valueOf(ref);

    }
}
