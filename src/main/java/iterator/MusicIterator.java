package iterator;

public class MusicIterator<E> implements Iterator<E> {

    private E[] es;

    private int position;

    public MusicIterator(E[] es) {
        this.es = es;
    }

    @Override
    public boolean hasNext() {
        return position != es.length;
    }

    @Override
    public E next() {
        E e = es[position];
        position++;
        return e;
    }
}
