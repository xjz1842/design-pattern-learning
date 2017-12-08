package responsibiltiyChain;

public class ConcreteHandlerA extends AbstractHandler{


    @Override
    public void handlerRequest(String condition) {

        if(condition.equals("A")){
            System.out.println("ConcreteHandlerA");
        }else{
            System.out.println("ConcreteHandlerA不处理，有其他handler处理");
            super.getHandler().handlerRequest(condition);
        }
    }
}

