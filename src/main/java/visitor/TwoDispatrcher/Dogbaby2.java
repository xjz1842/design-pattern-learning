package visitor.TwoDispatrcher;

public class Dogbaby2 extends Dog{

    @Override
    public void accept(Execute execute) {
        execute.execute(this);
    }
}
