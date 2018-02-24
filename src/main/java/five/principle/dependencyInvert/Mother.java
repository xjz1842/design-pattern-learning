package five.principle.dependencyInvert;


public class Mother {

    public void narrate(IReader reader){
        System.out.println("妈妈开始讲故事");
        System.out.println(reader.getContent());
    }
}
