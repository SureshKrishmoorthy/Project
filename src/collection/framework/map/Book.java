package collection.framework.map;

import java.util.Comparator;

public class Book {
    String name;
    double price;
    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }




}
class NameCompare implements Comparator<Book>{
    public int compare(Book o1, Book o2) {
        if(o1.getName().charAt(o1.getName().length()-1)>o2.getName().charAt(o2.getName().length()-1))
            return 1;
        else if(o1.getName().charAt(o1.getName().length()-1)<o2.getName().charAt(o2.getName().length()-1))
            return -1;
        else
            return 0;
    }

}
