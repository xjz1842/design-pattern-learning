package watch;

import java.util.Observable;
import java.util.Observer;

public class PoliceA implements Observer {

    //定义姓名
    private String name = "张";

    public String getObserverName() {
        return name;
    }

    public void setObserverName(String observerName) {
        this.name = observerName;
    }
    @Override
    public void update(Observable o, Object arg) {

        //更新消息数据
        System.out.println( name + "收到了发生变化的数据内容是："
                + ((HuanRen) o).getConent());
    }
}
