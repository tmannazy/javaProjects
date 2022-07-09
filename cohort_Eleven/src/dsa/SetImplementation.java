package dsa;

public class SetImplementation implements Set {
    private ArrayList setArr = new ArrayList();

    public boolean isEmpty() {
        return setArr.isEmpty();
    }

    public void remove(String element) {
        setArr.remove(element);
    }

    @Override
    public void add(String item) {
        if (!setArr.contains(item)) {
            setArr.add(item);
        }
    }

    public int size() {
        return setArr.size();
    }
}
