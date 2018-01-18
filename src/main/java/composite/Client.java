package composite;

public class Client {


    public static void main(String[] args) {

        Employee emp1 = new Developer("员工-小李",10000);
        Employee emp2 = new Developer("员工-小王",15000);

        Employee manage1 = new Manager("经理-小李",25000);

        manage1.add(emp1);
        manage1.add(emp2);

        Employee emp3 = new Developer("员工-小唐",20000);

        Manager generalManager =  new Manager("总经理-小吴",50000);

        generalManager.add(emp3);
        generalManager.add(manage1);

        generalManager.print();
    }
}
