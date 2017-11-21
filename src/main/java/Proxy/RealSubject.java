package Proxy;

public class RealSubject implements Subject {

    public void request() {
        System.out.println("Google 搜索 battcn");
    }
}
