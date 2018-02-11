package prototype;

import org.apache.commons.lang3.SerializationUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Customer implements Cloneable,Serializable {

    private static final  long serialVersionUID = 783202091017893997L;

    private int id;
    private String name;
    private Address address;
    private List<String> hobbies;

    @Override
    protected Customer clone() throws CloneNotSupportedException {
        return (Customer) super.clone();
    }

    public Customer deep() throws CloneNotSupportedException{
       Customer clone = (Customer)super.clone();
       clone.setAddress(clone.getAddress());
       return clone;
    }

    public Customer deepCopy()throws Exception{
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bos);
        out.writeObject(this);
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream in = new ObjectInputStream(bis);
        return (Customer) in.readObject();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", hobbies=" + hobbies +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Customer(int id, String name, Address address, List<String> hobbies) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.hobbies = hobbies;
    }

    public static void main(String[] args) throws Exception{
        List<String> hobbies = new ArrayList<>();
        hobbies.add("篮球1");
        hobbies.add("足球1");

        Customer original = new Customer(1,"淘宝客户-1",new Address("上海市"),hobbies);

        Customer copy = original.clone();
        System.out.println("-----拷贝前-----");
        System.out.println(original);
        System.out.println("-----拷贝后-----");
        System.out.println(copy);

        System.out.println("修改原始信息-----开始");

        original.setName("淘宝客户2");
        original.getHobbies().add("音乐");

        System.out.println("原始信息：" + original.toString());
        System.out.println("拷贝新秀: " + copy.toString());

        System.out.println("-----commonUtil ---------");
        Customer customer =  SerializationUtils.clone(original);
        System.out.println(customer);
    }

}
