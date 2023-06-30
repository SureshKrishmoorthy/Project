package com.FullCreative.intern;

public class LinkedLizt {
    private Node head;
    private Node tail;
    private int size;

    public LinkedLizt(){

    }

    public void insert(Object value){

        Node node=new Node(value);

        if(head==null){
            head=node;
            tail=head;
        }else{
            tail.next=node;
            tail=node;

        }
        size+=1;
    }

    public void loop(){
        Node obj=head;
        while (obj.next!=null){
            System.out.println(obj.value);
            obj=obj.next;
        }
        System.out.println(tail.value);
    }

    public boolean contain(Object o){
        Node obj=head;
        boolean bool=false;
        while (obj.next!=null){
            if(obj.value.equals(o) || tail.value.equals(o))
                bool=true;
            obj=obj.next;
        }
        return bool;
    }
    public boolean addAfter(Object present,Object newObj ){
        boolean bool=false;
        Node obj=head;
        if(contain(present)){
            while (obj.next!=null){
               if(obj.value.equals(present)){
                   Node node=new Node(newObj);
                   node.next=obj.next;
                   obj.next=node;
                   bool=true;
                   break;
               }else
                   obj=obj.next;
            }
        }
        return bool;
    }
//    public Object getval(int i){if (i < 0 || i >= size) {
//        throw new ArrayIndexOutOfBoundsException();
//    }
//
//        if (tail.index == i) {
//            return tail.value;
//        }
//
//        Node current = head;
//        while (current != null) {
//            if (current.index == i) {
//                return current.value;
//            }
//            current = current.next;
//        }
//
//        return null;
//    }
    public void insertLast(Object value){
        if(tail==null){
            insert(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size+=1;
    }
    public void insertFirst(Object value){
        if(head==null){
            insert(value);
            return;
        }
        Node node=new Node(value);
        node.next=head;
        head=node;
        size+=1;

    }
}
