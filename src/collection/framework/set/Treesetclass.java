package collection.framework.set;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Treesetclass {
    public static void main(String[] args) {
        TreeSet set=new TreeSet();
        set.add(62);
        set.add(22);
        set.add(33);
        set.add(44);
        System.out.println(set);
        System.out.println(set.ceiling(21));//nearby high value will be returned
        System.out.println(set);
        System.out.println(set.contains(33));
        System.out.println(set.first());
        System.out.println(set.floor(109));//nearby low value will be returned
        System.out.println(set.isEmpty());
        System.out.println(set.higher(23));
        System.out.println(set.last());
        System.out.println(set.lower(25));

        NavigableSet e=set.descendingSet();
        System.out.println(e.pollFirst());//removes the first element
        System.out.println(e.pollLast());//removes the last element
        Iterator it=e.iterator();
        while (it.hasNext()){
            System.out.println(it.next()+" *");
        }
    }
}
