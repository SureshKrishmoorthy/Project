package collection.framework.List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        List list=new ArrayList();
        List list2=new ArrayList();
        list.add(12);
        list.add("suresh");
        list.add(23.23);
        list.add(789890);
        System.out.println(list);
        list.add(2,89);
        System.out.println(list);
        list.remove(23.23);
        System.out.println(list);
        list.removeIf(num->num.equals(12));// iterate over the list and checks whether num is present or not
                                                //if it is present it will remove the element
        System.out.println(list);
        list2.add(list);//adds the entire list
        list2.add(88);
        list2.add(232);
        System.out.println(list2);
        list2.addAll(list);// add the objects present in the list
        System.out.println(list2);
        list2.removeIf(list1 -> list1.equals(list));//removes the object
        System.out.println(list2);
        list2.clear();
        System.out.println(list2);

        ArrayList lis=new ArrayList();
        lis.add(12);
        lis.add(23);
        lis.add(34);
        lis.add(76);

        System.out.println(lis);
        lis.set(2,44);
        System.out.println(lis);

        List liss=new LinkedList();
        liss.add(12);
        liss.add(23);
        liss.add(34);
        liss.add(76);
        System.out.println(liss);
        liss.add(2,44);
        System.out.println(liss);
    }
}
