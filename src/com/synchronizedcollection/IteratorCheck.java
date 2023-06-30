package com.synchronizedcollection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorCheck {
    public static void main(String[] args) {
        ArrayList list=new ArrayList<>();
        list.add(12);
        list.add(18);
        list.add(8);
        list.add(43);
        list.add(55);
        System.out.println(list);
        Iterator it=list.iterator();
        list.add(2,23);
        list.remove(2);
        System.out.println(it.next());

        //After creating iterator if we try to modify the list we will get concurrent modification
        //Exception
    }
}
