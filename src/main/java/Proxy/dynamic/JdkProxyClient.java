package Proxy.dynamic;


import Proxy.Subject;

public class JdkProxyClient {

    public static void main(String[] args) {

        Subject subject = SubjectHandler.createProxy();

        subject.request();
    }
}
