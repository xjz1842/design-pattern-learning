package visitor.TwoDispatrcher;

public class Dogbaby1  extends Dog {

    @Override
    public void accept(Execute execute) {
        execute.execute(this);
    }
}
