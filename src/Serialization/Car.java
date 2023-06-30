package Serialization;

import java.io.Serializable;

public class Car implements Serializable {
    String name;
    double price;
    String color;
    Engine engine;
    public Car(String name, double price, String color,Engine e) {
        engine=e;
        this.name = name;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Name: "+name+"Price:"+price+"color: "+color;
    }
}
