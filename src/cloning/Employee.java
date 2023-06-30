package cloning;

public class Employee implements Cloneable{
    private String name;
    private int id;
    private double salary;
    private Address address;
    public Employee(String name, int id, double salary, Address address) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee :" +
                "name=" + name  +
                ", id=" + id +
                ", salary=" + salary +
                ", address=" + address;
    }
}
