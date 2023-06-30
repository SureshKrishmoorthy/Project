package collection.framework.List;

import java.util.Enumeration;
import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack ref=new Stack();
        System.out.println(ref.capacity());
        ref.add(12);
        ref.add(13);
        ref.add(14);
        ref.add(14);
        System.out.println(ref);
        System.out.println(ref.push(10));
        ref.push(11);
        System.out.println(ref);
        System.out.println(ref.pop());
        System.out.println(ref);
        System.out.println(ref.empty());
        ref.ensureCapacity(12);
        System.out.println(ref.capacity());
        Enumeration e=ref.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

    }
}
