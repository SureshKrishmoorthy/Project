package collection.framework.map;

import java.util.*;

public class Map {
    public static void main(String[] args) {
        HashMap hashMap=new HashMap<Integer,String>();
        hashMap.put(22,"suresh");
        hashMap.put(2,"Abi");
        hashMap.put(3,"Suresh");
        hashMap.put(2,"krish");
        hashMap.put(5,"suresh");
        System.out.println(hashMap);
        System.out.println(hashMap.get(3));
        System.out.println(hashMap.remove(5));
        System.out.println(hashMap);
        System.out.println(hashMap.containsKey(3));//returns boolean value whether the map contains key or not
        System.out.println(hashMap.containsValue("Krish"));//returns boolean value whether the map contains value or not
        System.out.println(hashMap.isEmpty());//returns boolean value based on whether the map is empty or not
        System.out.println(hashMap.putIfAbsent(4,"moothy"));
        System.out.println(hashMap);

        HashMap hash =new HashMap<Character,String>();
        hash.put('b',"suresh");
        hash.put('a',"Krish");
        hash.put('i',"abi");
        hash.put('k',"Moorthy");
        hash.put(null,"suresh");
        System.out.println(hash);



       Set set= hash.entrySet();
        System.out.println(set);
        Iterator list=set.iterator();
        while (list.hasNext()){
//            System.out.println(list.next());
            java.util.Map.Entry entry= (java.util.Map.Entry) list.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}
