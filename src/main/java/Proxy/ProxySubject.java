package Proxy;

public class ProxySubject implements Subject{

    private RealSubject realSubject;

    public void request() {
        System.out.println("向代理发送请求");
        //用到的时候加载
        if(realSubject == null){
            realSubject = new RealSubject();
        }
        realSubject.request();
        System.out.println("代理服务器响应请求");
    }
}
