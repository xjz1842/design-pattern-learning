package decorate;

public class NewPerson implements Person{

    private OldPerson p;

    NewPerson(OldPerson p) {
        this.p = p;
    }

    @Override
    public void eat() {
        System.out.println("生火");
        System.out.println("做饭");
        p.eat();
        System.out.println("刷碗");
    }
}


