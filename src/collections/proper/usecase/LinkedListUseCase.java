package collections.proper.usecase;

import usecase.Image;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;

public class LinkedListUseCase{
    static LinkedList image;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        boolean b=true;
        image=new LinkedList<Images>();
        image.add(new Images("flower",12,"1000",new Date()));
        image.add(new Images("tree",14,"1030",new Date()));
        image.add(new Images("beach",22,"1200",new Date()));
        image.add(new Images("sun",13,"1010",new Date()));
        image.add(new Images("moon",42,"1200",new Date()));
        ListIterator li=image.listIterator();
        do{
            System.out.println("Enter 1 to go next 2. to go previous");
            int num=in.nextInt();
            switch (num){
                case 1:{Images i=null;
                    try {
                    i=(Images)li.next();
                }catch (NoSuchElementException | NullPointerException e){
                    System.out.println(e);
                }
                    System.out.println(i.toString());
                    break;}
                case 2:{Images i=null;
                    try {
                        i=(Images)li.previous();
                    }catch (NoSuchElementException | NullPointerException e){
                        System.out.println(e);
                    }
                    System.out.println(i.toString());
                    break;}
                case 3:{
                    b=false;
                    break;}
            }
        }while (b);
    }



}
