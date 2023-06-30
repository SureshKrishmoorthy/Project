package Serialization;

public class Student extends Teacher{
    String name;



    public Student(String school_name,int school_id,String name, int id, String name1, int id1) {
        super(school_name,school_id,name, id);
        this.name = name1;
        this.id = id1;
    }

     int age=123;
    transient int id;

//    public Student(String name, int id, String name1, int id1, String name2, int id2) {
//        super(name, id, name1, id1);
//        this.name = name2;
//        this.id = id2;
//    }


    void detailsOfStudent(){
        System.out.println(age);
    }
    public String toString(){
        return "Name:"+name+"Age:"+age+"Id:"+"id";
    }
}
