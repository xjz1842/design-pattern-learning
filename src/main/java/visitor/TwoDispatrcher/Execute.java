package visitor.TwoDispatrcher;

public class Execute {

    public void execute(Dog dog){
        System.out.println("上古dog");
    }

    public void execute(Dogbaby1 baby1){
        System.out.println("上古dog 第一代子孙");
    }

    public void execute(Dogbaby2 baby2){
        System.out.println("上古dog 第二代子孙");
    }


}
