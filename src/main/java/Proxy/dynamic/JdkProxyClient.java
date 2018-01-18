package Proxy.dynamic;

import Proxy.RealSubject;
import Proxy.Subject;

import java.lang.reflect.Field;

public class JdkProxyClient {

    public static void main(String[] args)throws Exception {
        Subject subject = SubjectHandler.createProxy(new RealSubject());

        subject.request();

        Integer a = 1;
        Integer b = 2;
        swap1(a,b);

        System.out.println(a + ":"+b);
    }

    private static void swap(Integer a ,Integer b){

        Integer tmp = null;
        tmp = a;
        a = b;
        b = tmp;

        System.out.println(a+":"+b);
    }

    private static void swap1(Integer a ,Integer b){
        Integer tmp = a;

        try {
            Field value = Integer.class.getDeclaredField("value");
            value.setAccessible(true);
            value.set(a,b);
            System.out.println(a + ":" + b);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
