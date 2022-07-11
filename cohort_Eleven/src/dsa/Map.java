package dsa;

public interface Map {
    void put(String key, String value);

    boolean isEmpty();

    int size();

    boolean containsKey(Object key);

    boolean containsValue(Object value);

    String get(Object key);

    String keySet();

    void clear();

    void remove(Object key);

    String values();
}
