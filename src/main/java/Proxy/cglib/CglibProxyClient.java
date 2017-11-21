package Proxy.cglib;


import Proxy.RealSubject;
import Proxy.Subject;

public class CglibProxyClient {

    public static void main(String[] args) {

        SubjectProxy proxy = new SubjectProxy();

        Subject subject = (RealSubject)proxy.getInstance(new RealSubject());

        subject.request();

    }
}
