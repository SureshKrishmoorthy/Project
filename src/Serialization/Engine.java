package Serialization;

import java.io.Serializable;

public class Engine implements Serializable {
    String name;
    int cc;

    String type;

    @Override
    public String toString() {
        return "Name: "+name+"CC: "+cc+"Type: "+type;
    }

    public Engine(String name, int cc, String type) {
        this.name = name;
        this.cc = cc;
        this.type = type;
    }

}
