package visitor.TwoDispatrcher;

public class Dog {

    public void accept(Execute execute){
        execute.execute(this);
    }
}
