package Serialization;

import java.io.Serializable;

public class School implements Serializable {
    String School_name;
    int School_id;

    @Override
    public String toString() {
        return "Name : "+School_name+" ID: "+School_id;
    }

    public School(String school_name) {
        School_name = school_name;
    }

    public School(String name, int id) {
        this.School_name = name;
        this.School_id = id;
    }

}
