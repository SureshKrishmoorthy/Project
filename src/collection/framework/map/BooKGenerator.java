package collection.framework.map;

import java.util.*;
import java.util.Map;

public class BooKGenerator {
    public static void main(String[] args) {
        Book b1=new Book("xyz",238);
        Book b2=new Book("xyx",239);
        Book b3=new Book("abc",2398);
        TreeMap <Integer,Book> map=new TreeMap<Integer,Book>();
        map.put(1,b1);
        map.put(2,b2);
        map.put(3,b3);
        System.out.println(map);//Traversing through map using entry set
        for(Map.Entry entry: map.entrySet()){
            Book book=(Book) entry.getValue();
            System.out.println(book.getName()+" :  "+book.getPrice());
        }
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        System.out.println(map.get(12));//returns the null
        System.out.println(map.lowerKey(12));//returns how many lower key are available from the passed index
    }

}
