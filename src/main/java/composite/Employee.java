package composite;

public interface Employee {

    void   add(Employee employee);

    void   remove(Employee employee);

    void print();

    //省略其它方法,如 getChild
}
