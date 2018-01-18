package visitor.TwoDispatrcher;

public class Client {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Dogbaby1 dogbaby1 = new Dogbaby1();
        Dogbaby2 dogbaby2 = new Dogbaby2();

        Execute execute = new Execute();

        dog.accept(execute);
        dogbaby1.accept(execute);
        dogbaby2.accept(execute);
    }
}
