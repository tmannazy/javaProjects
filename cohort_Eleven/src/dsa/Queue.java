package dsa;

public interface Queue {

    boolean isEmpty();

    void add(String element);

    String remove(Object element);

    int size();

    String peek();

    String poll();

    String set(int index, Object item);

    String get(int index);

    void clear();
}
