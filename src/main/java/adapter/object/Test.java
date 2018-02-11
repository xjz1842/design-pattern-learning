package adapter.object;

import adapter.Adaptee;
import adapter.Target;

public class Test {

    public static void main(String[] args) {
        Target adapter = new Adapter(new Adaptee());
        adapter.request();
    }
}
