package collection.framework.Queue;

public class Employee implements Comparable<Employee>{
    String name;

    @Override
    public String toString() {
        return "Name :"+name+" : ID "+id;
    }

    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Employee o) {
        if(this.id>o.id)
            return 1;
        else
            return -1;
    }
}
