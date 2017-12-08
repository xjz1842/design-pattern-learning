package responsibiltiyChain;

public class ConcreteHandlerZ extends AbstractHandler {

    @Override
    public void handlerRequest(String condition) {
            System.out.println("ConcreteHandler最后一个处理");
    }

}
