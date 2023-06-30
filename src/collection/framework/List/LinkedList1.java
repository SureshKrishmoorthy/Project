package collection.framework.List;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add(12);
        list.add(34);
        list.add(87);
        list.add(77);
        list.add(34);
        System.out.println(list);
        list.add(1,89);
        System.out.println(list);
        ListIterator i=list.listIterator(2);//iterates the value from the index we have passed if we use next()
        while (i.hasNext()){
            System.out.println(i.next());
        }
        list.addFirst(11);
        list.addLast(99);
        System.out.println(list);
        List list11= (List) list.clone();//clones the list and returns in the form of an array
        System.out.println(list11);
        System.out.println(list.indexOf(77));//returns the index of the object if it is nor present it will return -1
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.getClass());

        System.out.println(list.pollFirst());//deletes the first object in the list
        System.out.println(list.pollFirst());
        System.out.println(list.peekFirst());//returns the first object in the list
        System.out.println(list.peekLast());
        list.add(null);
        System.out.println(list);

        list.push(23);
        System.out.println(list);
        System.out.println(list.pop());
        System.out.println(list);

        System.out.println("**************");
        ListIterator li=list.listIterator();
        System.out.println(li.next());
        System.out.println(li.previous());
        System.out.println(li.next());
        System.out.println(li.next());
        System.out.println(li.previous());
    }
}
