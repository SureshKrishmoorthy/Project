package collection.framework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ArrayList2 {
    public static void main(String[] args) {
        List ls=new ArrayList();
        ls.add(82);
        ls.add(32);
        ls.add(56);
        ls.add(77);
//        Collections.sort(ls);
        System.out.println(ls.get(0));
//        for (int i=0;i<ls.size();i++){
//            if(ls.get(i).equals(56)){
//                ls.add(76);
//            }
//        }
        ls.add(1,77);
        System.out.println(ls);

        List<String> ls2=new ArrayList<String>();
        ls2.add("Suresh");
        ls2.add("Krish");
        ls2.add("suresh");
        Collections.sort(ls2);//sort the list
        System.out.println(ls2);
        ls2.remove("suresh");//remove the object
        ls2.remove(0);//remove the index's object
        System.out.println(ls2);

        List ls3=new ArrayList<Integer>();
        ls3.add(12);
        ls3.add(23);
        ls3.add(55);
        ls3.add(77);
        for(int i=0;i<ls3.size();i++){
            System.out.println(ls3.get(i));
        }
        System.out.println(ls3.contains(77));
        ls3.removeAll(ls);//removes the objects present in the passed method object
        System.out.println(ls3);
        System.out.println(ls3.isEmpty());//checks the error is empty or not
        System.out.println(ls3.hashCode());//generates a hashcode
        System.out.println(ls.hashCode());
        List newlist=ls3.subList(1,3);
        System.out.println(newlist);
        Object o=ls.set(2,4);
        System.out.println(o);
        System.out.println(ls);


        List<Integer> ref=new ArrayList<>();
        ref.add(12);
        ref.add(13);
        ref.add(14);
        ref.add(15);
        System.out.println(ref);
        ref.remove(0);
        System.out.println(ref);
    }
}
