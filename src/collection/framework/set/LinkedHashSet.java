package collection.framework.set;

import java.util.Spliterator;

public class LinkedHashSet {
    public static void main(String[] args) {
        java.util.LinkedHashSet ref= new java.util.LinkedHashSet<String>();
        ref.add("Suresh");
        ref.add("Krish");
        ref.add("suresh");
        ref.add("Suresh");
        ref.add(null);
        ref.add(null);
        System.out.println(ref);
        Spliterator sp=ref.stream().spliterator();
        System.out.println(sp.estimateSize());
        System.out.println(sp.trySplit());

        Object[] array=ref.toArray();
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]+" *");
        }
    }
}
