package collection.framework.List;

import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        Vector vector=new Vector();
        System.out.println(vector.capacity());
        vector.add(11);
        vector.add(22);
        vector.add(33);
        vector.add(44);
        vector.add(55);
        vector.add(22);
        System.out.println(vector);
        ListIterator i=vector.listIterator();
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        System.out.println(vector.lastIndexOf(22));
//        vector.removeAllElements(); // removes all the elements
        System.out.println(vector);
        System.out.println(vector.capacity());
        vector.trimToSize();
        System.out.println(vector.capacity());
        Enumeration enume=vector.elements();
        while(enume.hasMoreElements()){
            System.out.println(enume.nextElement()+":");
        }
//       ListIterator list= (ListIterator) enume.asIterator();
//        while (list.hasNext()){
//            System.out.println(list.next());
//        }
//        while (list.hasPrevious()){
//            System.out.println(list.previous());
//        }
    }
}
