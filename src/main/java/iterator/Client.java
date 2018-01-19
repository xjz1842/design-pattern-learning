package iterator;

public class Client {

    public static void main(String[] args) {

        AbstractList<String> list = new MusicList();

        list.add("凉凉");
        list.add("十年");
        list.add("凉凉");
        list.add("十年");
        list.add("在人间");

        Iterator<String> iterator = list.createIterator();

        while (iterator.hasNext()){
           String name = iterator.next();System.out.println(name);
        }

    }
}
