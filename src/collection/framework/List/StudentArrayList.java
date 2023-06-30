package collection.framework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;

public class StudentArrayList {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(new Student("Auresh",22,95));
        al.add(new Student("Krish",21,99));
        al.add(new Student("suresh",25,91));

//        Comparator comp=Comparator.comparing(Student::getName);
//        Collections.sort(al);
//        ListIterator li=al.listIterator();
//        while (li.hasNext()){
//            Student s=(Student) li.next();
//            System.out.println(s.age+":"+s.name+":"+s.marks);
//        }
////        Comparator com=Comparator.comparing(Student::getAge);
////        Collections.sort(al);
////        System.out.println(al.toString());
//        ListIterator lii=al.listIterator();
//        while (lii.hasNext()){
//            Student s=(Student) lii.next();
//            System.out.println(s.age+":"+s.name+":"+s.marks);
//        }
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
    }
}
