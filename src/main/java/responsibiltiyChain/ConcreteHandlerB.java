package responsibiltiyChain;

public class ConcreteHandlerB extends AbstractHandler {

    @Override
    public void handlerRequest(String condition) {

        if(condition.equals("B")){
            System.out.println("ConcreteHandlerB");
        }else{
            System.out.println("ConcreteHandlerB不处理，有其他handler处理");
            super.getHandler().handlerRequest(condition);
        }
    }

}
