package state;

public class ConcreteStateA extends State {

    @Override
    public void Behavior() {
        // 状态A 的业务行为, 及当为该状态下时，能干什么
        // 如：手机在未欠费停机状态下, 能正常拨打电话
        System.out.println("手机在未欠费停机状态下, 能正常拨打电话");
    }

}
