package collection.framework.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MapComparator {
    public static void main(String[] args) {
        HashMap hash=new HashMap<Integer,String>();
        hash.put(22,"suresh");
        hash.put(2,"Abi");
        hash.put(3,"Suresh");
        hash.put(2,"krish");
        hash.put(5,"suresh");
        System.out.println(hash);
        hash.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(System.out::println);
        hash.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.naturalOrder())).forEach(System.out::println);
    }
}
