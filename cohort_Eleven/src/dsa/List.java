package dsa;

public interface List {
    boolean isEmpty();

    void add(String item);

    void remove(Object item);

    int size();

    String get(int index);

    int capacity();

    boolean contains(String item);

    void set(int index, Object item);
}
