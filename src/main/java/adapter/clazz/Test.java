package adapter.clazz;

import adapter.Target;

public class Test {


    public static void main(String[] args) {
        //使用特殊功能类，即适配类
        Target adapter = new Adapter();
        adapter.request();
    }
}
