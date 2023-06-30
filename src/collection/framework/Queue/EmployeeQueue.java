package collection.framework.Queue;

import java.util.PriorityQueue;

public class EmployeeQueue {
    public static void main(String[] args) {
        PriorityQueue<Employee> employee=new PriorityQueue<Employee>();
        employee.offer(new Employee("Suresh",12));
        employee.offer(new Employee("Krish",3));
        employee.offer(new Employee("Vishnu",23));
        System.out.println(employee);
        System.out.println(employee.remove());
        System.out.println(employee);
    }
}
