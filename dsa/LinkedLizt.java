package com.dsa;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLizt {

    private Node head;

    private Node tail;
    private Node previous = null;


    public void insertElement(Object value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=node;return;
        }
        tail.next=node;
        Node temp=tail;
        tail=node;
        tail.prev=tail;
    }

    public void loop(){
        if(head==null){
            return;
        }
        Node obj=head;
        while(tail!=null && obj!=null){
            System.out.println(obj.value);
            obj=obj.next;
        }
    }

    public Iterater iterater(){
        return new Iterater() {
            private Node next = null;
            private Node iter=null;
            @Override
            public Object next() {
                if(next==null){
                    next=head;
                    return next.value;
                }
                next=next.next;
                return next.value;
            }

            @Override
            public Object previous() {
                return null;
            }

            @Override
            public boolean hasNext() {
                if(iter==null){
                    iter=head;
                }

                if(iter!=null){
                    iter=iter.next;
                    return true?false:iter.value!=null;
                }
                return false;
            }

            @Override
            public boolean hasPrevious() {
                return false;
            }
        };
    }


}
