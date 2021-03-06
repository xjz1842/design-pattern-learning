package command;

public class ConcreteCommand  extends Command{

    private Receiver receiver;

    public ConcreteCommand (Receiver receiver){
        this.receiver= receiver;
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }

}
