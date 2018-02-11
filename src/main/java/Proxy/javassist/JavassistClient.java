package Proxy.javassist;


import Proxy.Subject;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtNewConstructor;
import javassist.CtNewMethod;

public class JavassistClient {

    public static void main(String[] args) throws Exception{

       Subject subject =  createJavassistBytecodeBynamicProxy();
       subject.request();
    }

    private static Subject createJavassistBytecodeBynamicProxy() throws Exception {
        ClassPool classPool = new ClassPool(true);
        CtClass ctClass = classPool.makeClass(Subject.class.getName() + "JavassistProxy");
        ctClass.addInterface(classPool.get(Subject.class.getName()));
        ctClass.addConstructor(CtNewConstructor.defaultConstructor(ctClass));
        ctClass.addMethod(CtNewMethod.make("public void request() {System.out.print(\"request\");}",ctClass));

        Class<?> clazz = ctClass.toClass();

       Subject subjectProxy =  (Subject)clazz.newInstance();

       return subjectProxy;
    }

}
