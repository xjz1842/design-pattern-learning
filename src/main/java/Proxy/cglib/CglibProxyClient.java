package Proxy.cglib;

import Proxy.RealSubject;
import Proxy.Subject;
import net.sf.cglib.reflect.FastClass;
import net.sf.cglib.reflect.FastMethod;


public class CglibProxyClient {

    public static void main(String[] args) throws Exception{
        long start = System.currentTimeMillis();
        SubjectProxy proxy = new SubjectProxy();

        Subject subject = (RealSubject)proxy.getInstance(new RealSubject());
        subject.request();
        System.out.println(System.currentTimeMillis()-start);

         start = System.currentTimeMillis();
         Subject object = RealSubject.class.newInstance();

        //cglib的反射调用
        FastClass serviceFastClass = FastClass.create(Subject.class);
        FastMethod serviceFastMethod = serviceFastClass.getMethod("request", new Class[]{});
        serviceFastMethod.invoke(object, new Object[]{});
        System.out.println(System.currentTimeMillis()-start);

    }
}
