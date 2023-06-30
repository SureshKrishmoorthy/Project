package cloning;

public class DemoClone {
    public static void main(String[] args) {
        Address address = new Address("Chennai", 600021, "Abc");
        Employee emp1 = new Employee("Suresh", 3, 30000, address);
        Employee emp2 = null;
        Employee emp3=emp1;
        try {
            emp2 = (Employee) emp1.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(emp1);
        System.out.println(emp2);
        emp1.setAddress(new Address("Bangalore",700021,"abc"));
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
    }
}
