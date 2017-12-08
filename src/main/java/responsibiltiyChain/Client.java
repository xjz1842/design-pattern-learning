package responsibiltiyChain;

public class Client {

    public static void main(String[] args) {

        AbstractHandler handlerA = new ConcreteHandlerA();

        AbstractHandler handlerB = new ConcreteHandlerB();

        AbstractHandler handlerZ = new ConcreteHandlerZ();

        handlerA.setHandler(handlerB);
        handlerB.setHandler(handlerZ);

        handlerA.handlerRequest("Z");
    }
}
