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

    @Override
    public String toString() {
        String setArrContent = "";
        for (int i = 0; i < setArr.size(); i++) {
            if (i == setArr.size() - 1) {
                setArrContent = setArrContent + setArr.get(i);
            }else {
                setArrContent = setArrContent + setArr.get(i) + ", ";
            }
        }
        return setArrContent;
    }
}
