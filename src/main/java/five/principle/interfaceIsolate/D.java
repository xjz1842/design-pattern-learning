package five.principle.interfaceIsolate;

public class D implements I1,I3{

    @Override
    public void method1() {
        System.out.println("类D实现接口I1的方法1");
    }

    @Override
    public void method4() {
        System.out.println("类D实现接口I3的方法4");
    }

    @Override
    public void method5() {
        System.out.println("类D实现接口I3的方法5");
    }

}
