package decorate;

public class OldPerson implements Person{

    @Override
    public void eat() {
        System.out.println("吃饭");
    }
}
