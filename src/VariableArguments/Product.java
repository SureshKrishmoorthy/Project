//package VariableArguments;
//
//import java.util.ArrayList;
//import java.util.stream.Collectors;
//
//public class Product {
//    String name;
//    int id;
//    double price;
//
//    public Product(String name, int id, double price) {
//        this.name = name;
//        this.id = id;
//        this.price = price;
//    }
//
//    public static void main(String[] args) {
//        ArrayList list=new ArrayList<Product>();
//        list.add(new Product("Abc",12,23000));
//        list.add(new Product("xyz",11,43000));
//        list.add(new Product("jkl",19,63000));
//        list.add(new Product("qwe",13,25000));
//        list.add(new Product("yui",13,20000));
//
//        ArrayList<Double> list1=list.stream().filter(p->p.price>22000).map(p.price).collect(Collectors.toList());
//    }
//}
