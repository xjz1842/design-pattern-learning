package adapter.clazz;

import adapter.Adaptee;
import adapter.Target;

public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.specificRequest();
    }
}
