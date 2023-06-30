package collection.framework.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class Priorityqueue<E> {
    public static void main(String[] args) {
        PriorityQueue queue =new PriorityQueue<String>();
        System.out.println(queue.size());
        queue.add("Suresh");
        queue.add("Krish");
        queue.add("suresh");
        queue.add("krish");
        System.out.println(queue);
        System.out.println(queue.size());
//        System.out.println(queue.remove());
//        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue);

        PriorityBlockingQueue pq =new PriorityBlockingQueue<Integer>();
        pq.add(12);
        pq.add(4);
        pq.add(98);
        pq.add(45);
        System.out.println(pq);

        Queue ref=new PriorityQueue<Integer>();
        ref.add(50);
        ref.add(22);
        ref.add(33);
        ref.add(10);
        System.out.println(ref);
        PriorityQueue ref1=new PriorityQueue<Integer>(4);
        ref1.add(12);
        ref1.add(4);
        ref1.add(45);
        ref1.add(98);
        ref1.offer(121);
        System.out.println(ref1.element());
        System.out.println(ref1);
        System.out.println(ref1.peek());
        System.out.println(ref1);
        Comparator com=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.charAt(o1.length()-1)<o2.charAt(o2.length()-1))
                    return 1;
                else
                    return -1;
            }
        };
        PriorityQueue queue1 =new PriorityQueue<String>(com);
        System.out.println(queue.size());
        queue1.add("Suresh");
        queue1.add("KrisA");
        queue1.add("suresa");
        queue1.add("krish");
//        System.out.println(queue1.remove());
        System.out.println(queue1);
        System.out.println(queue);
    }
}
