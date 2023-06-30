package collection.framework.List;

import java.util.*;
import java.util.function.Consumer;

public class ArrayListClass {
    public static void main(String[] args) {
        String str="";
        List<String> ls=new ArrayList();
        ls.add("Suresh");
        ls.add("123");
        ls.add("12.43");
        ls.add("987665");
        Collections.sort(ls);
        System.out.println(ls);
//        ls.forEach(System.out::println);
//        ls.replaceAll(String::toUpperCase);
//        System.out.println(ls);

    }


}
