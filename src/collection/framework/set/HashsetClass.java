package collection.framework.set;

import java.util.HashSet;

public class HashsetClass {
    public static void main(String[] args) {
        HashSet set=new HashSet<Integer>();
        set.add(12);
        set.add(23);
        set.add(45);
        set.add(67);
        System.out.println(set);
        Object[] obj=set.toArray();
//        Integer[] integer= (Integer[]) set.toArray();
        for (int i=0;i<obj.length;i++){
            System.out.println(obj[i]);
        }
        System.out.println(set.size());
    }
}
