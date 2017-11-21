package Proxy;

public class StaticProxyClient {

    public static void main(String[] args) {

        //使用代理
        Subject subject = new ProxySubject();

        subject.request();
    }
}
