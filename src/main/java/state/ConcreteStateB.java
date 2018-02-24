package state;

public class ConcreteStateB extends State{

    @Override
    public void Behavior() {
        // 状态B 的业务行为, 及当为该状态下时，能干什么
        // 如：手机在欠费停机状态下, 不 能拨打电话
        System.out.println("手机在欠费停机状态下, 不能拨打电话");
    }

}
