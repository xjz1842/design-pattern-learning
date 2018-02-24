package watch;

import java.util.Observable;

public class HuanRen extends Observable {

    // 要观察的数据：消息发生改变时，所有被添加的观察者都能收到通知
    private String message;

    public String getConent() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        // 被观察者数据发生变化时，通过以下两行代码通知所有的观察者
        this.setChanged();
        this.notifyObservers(message);
    }
}
