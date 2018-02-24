package five.principle.interfaceIsolate;

public class B  implements I1, I2{

    @Override
    public void method1() {
        System.out.println("类B实现接口I1的方法1");
    }

    @Override
    public void method2() {
        System.out.println("类B实现接口I2的方法2");
    }

    @Override
    public void method3() {
        System.out.println("类B实现接口I2的方法3");
    }

}
