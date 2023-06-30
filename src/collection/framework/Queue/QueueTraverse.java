package collection.framework.Queue;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Spliterator;

public class QueueTraverse {
    public static void main(String[] args) {
        PriorityQueue ref1=new PriorityQueue<Integer>(6);
        ref1.add(12);
        ref1.add(4);
        ref1.add(45);
        ref1.add(98);
        ref1.offer(121);
        System.out.println(ref1);

        Iterator i=ref1.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
