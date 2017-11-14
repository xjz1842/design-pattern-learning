package composite;

public class Developer implements Employee{

    private  String  name;

    private double salary;

    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void add(Employee employee) {

    }

    public void remove(Employee employee) {

    }

    public void print() {
        System.out.println("----------------------");
        System.out.println("Name----------------"+this.name);
        System.out.println("\t\t\tSalary----------------"+this.salary);
        System.out.println("----------------------");
    }
}

