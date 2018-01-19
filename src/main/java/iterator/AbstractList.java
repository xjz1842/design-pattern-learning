package iterator;

public interface AbstractList <E>{

    void add (E e);

    Iterator createIterator();
}
