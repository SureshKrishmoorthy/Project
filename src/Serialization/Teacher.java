package Serialization;

public class Teacher extends School{
    String name;
    int id;



    public Teacher(String school_name,int school_id,String name, int id) {
        super(school_name,school_id);
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Name: "+name+"Id:"+id;
    }
}
