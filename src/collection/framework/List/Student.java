package collection.framework.List;

public class Student implements Comparable<Student> {
    String name;
    int age;

    int marks;

    public Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }


    public String toString() {
        return name+": "+age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }


    @Override
    public int compareTo(Student o) {
        if(this.age>o.age)
            return 1;
        else
            return -1;
    }
}
