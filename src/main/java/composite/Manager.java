package composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{

    private String name;

    private double salary;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    private List<Employee> employees = new ArrayList<Employee>();

    public void add(Employee employee) {
        employees.add(employee);
    }

    public void remove(Employee employee) {
        employee.remove(employee);
    }

    public void print() {
        System.out.println("--------------");
        System.out.print("Name="+this.name);
        System.out.println("\t\t\tSalary"+this.salary);
        System.out.println("--------------");

        for (Employee employee: employees){
            employee.print();
        }
    }
}
