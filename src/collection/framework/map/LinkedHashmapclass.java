package collection.framework.map;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmapclass {
    public static void main(String[] args) {
        LinkedHashMap ref=new LinkedHashMap();
        ref.put(12,"Suresh");
        ref.put("Suresh",23);
        System.out.println(ref);

        LinkedHashMap map=new LinkedHashMap<Integer,String>();
        map.put(12,"Suresh");
        map.put(23,"Krish");
        map.put(22,"MAp");
        map.put(1,"Hashmp");
        System.out.println(map);

        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.naturalOrder()))
                .forEach(System.out::println);
    }
}
