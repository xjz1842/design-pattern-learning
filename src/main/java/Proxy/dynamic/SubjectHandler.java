package Proxy.dynamic;

import Proxy.RealSubject;
import Proxy.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class SubjectHandler implements InvocationHandler {

    private  Subject subject;


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("向代理服务器发起请求");

        //如果第一次调用，生成真实主题
        if(subject == null){
            subject = new RealSubject();
        }

        subject.request();

        //返回真实主题完成实际的操作
        System.out.println("代理服务器响应请求");

        //如果返回值可以直接 return subject.request()
        return null;
    }

    public static <T> T createProxy(final Subject sub)throws Exception{
        return (T) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Subject.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //如果第一次调用，生成真实主题
                sub.request();
                //返回真实主题完成实际的操作
                System.out.println("代理服务器响应请求");

                return null;
            }
        });
    }
}
