package watch;

public class Client {

    public static void main(String[] args) {
        // 创建一个具体的被 观察者
        HuanRen observable = new HuanRen();
        // 创建第一个观察者
        PoliceA one = new PoliceA();
        one.setObserverName("我是观察者A");
        // 创建第二个观察者
        PoliceB two = new PoliceB();
        two.setObserverName("我是观察者B");
        // 注册观察者
        observable.addObserver(one);
        observable.addObserver(two);
        // 目标更新天气情况
        observable.setMessage("***我要更新的数据***");
    }
}
