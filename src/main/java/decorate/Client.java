package decorate;

public class Client {

    public static void main(String[] args) {
        OldPerson old = new OldPerson();
        //old.eat();
        NewPerson np = new NewPerson(old);
        np.eat();
    }
}
