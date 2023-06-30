package collection.framework.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntrySetclass {
    public static void main(String[] args) {
        HashMap hashMap=new HashMap<Integer,String>();
        hashMap.put(22,"suresh");
        hashMap.put(2,"Abi");
        hashMap.put(3,"Suresh");
        hashMap.put(2,"krish");
        hashMap.put(5,"suresh");
        hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.naturalOrder())).forEach(System.out::println);
        Set set=hashMap.keySet();

    }
}
