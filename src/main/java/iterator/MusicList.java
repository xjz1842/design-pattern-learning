package iterator;


public class MusicList implements AbstractList<String>{

    private String[] books = new String[5];

    private int position=0;


    @Override
    public void add(String s) {
        books[position]=s;
        position++;
    }

    @Override
    public Iterator createIterator() {
        return new MusicIterator(books);
    }
}
