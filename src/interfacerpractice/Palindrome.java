package interfacerpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Palindrome {
    static String small="",big=" ";
    static ArrayList list;
    public static void main(String[] args) {
        String s="a wow madam racecar";
        String[] a=s.split(" ");
        list=new ArrayList<String>();
        for(String st:a){
            m2(st);
        }
        Comparator com=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()>o2.length())
                    return 1;
                else
                    return -1;
            }
        };
        Collections.sort(list,com);
        System.out.println(list);
        System.out.println("short :"+list.get(0));
        System.out.println("long :"+list.get(list.size()-1));
    }

    private static void m2(String st) {
        String rev="";
        for (int i=0;i<st.length();i++){
            rev+=st.charAt(i);
        }
        if(rev.equals(st))
            list.add(st);
    }


}
