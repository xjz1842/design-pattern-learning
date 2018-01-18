package visitor;


import java.util.ArrayList;
import java.util.List;

public class Home {

    private List<Animal> nodeList = new ArrayList<>();

    void action(Person person){
        for(Animal node : nodeList){
            node.accept(person);
        }
    }

    void add(Animal animal){
        nodeList.add(animal);
    }


}
