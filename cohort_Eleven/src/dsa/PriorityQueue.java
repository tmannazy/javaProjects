package dsa;

public class PriorityQueue implements Queue {
    private ArrayList queueArr = new ArrayList();

    @Override
    public boolean isEmpty() {
        return queueArr.isEmpty();
    }

    @Override
    public void add(String element) {
        queueArr.add(element);
    }

    @Override
    public String remove(Object element) {
        String elStored = null;
        for (int i = 0; i < queueArr.size(); i++) {
            if (queueArr.get(i) == element) {
                elStored = queueArr.get(i);
                queueArr.remove(element);
                break;
            }
        }
        return elStored;
    }

    @Override
    public int size() {
        return queueArr.size();
    }

    @Override
    public String peek() {
        if (!queueArr.isEmpty()) {
            return queueArr.get(0);
        }
        return null;
    }

    @Override
    public String poll() {
        String el = null;
        if (!queueArr.isEmpty()) {
            el = queueArr.get(0);
            queueArr.remove(el);
            return el;
        }
        return null;
    }

    @Override
    public String set(int index, Object item) {
        String el = queueArr.get(index);
        queueArr.set(index, item);
        return el;
    }

    @Override
    public String get(int index) {
        return queueArr.get(index);
    }

    @Override
    public void clear() {
      queueArr.setSize();
    }
}
