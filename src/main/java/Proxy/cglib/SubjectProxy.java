package Proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

import java.lang.reflect.Method;

public class SubjectProxy  implements MethodInterceptor{

    private Object target;

    public Object getInstance(Object target){

        this.target = target;

        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(this.target.getClass());

        //回调方法
        enhancer.setCallback(this);

        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, net.sf.cglib.proxy.MethodProxy methodProxy) throws Throwable {
        System.out.println("向代理服务器发起请求");

        Object object = methodProxy.invokeSuper(o,objects);

        System.out.println("代理服务器响应请求");

        return object;
    }
}
