package dsa;

import java.util.Objects;

public class ArrayList implements List {
    private int size;
    private String[] elements = new String[5];

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(String item) {
        capacity();
        elements[size++] = item;
    }

    @Override
    public void remove(String item) {
        String[] tempArr = new String[elements.length];
        int i = 0;
        for (String element : elements) {
            if (!Objects.equals(element, item)) {
                tempArr[i] = element;
                i++;
            }
        }
        elements = tempArr;
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String get(int index) {
        return elements[index];
    }

    @Override
    public int capacity() {
        if (elements.length == size) {
            String[] newArray = new String[elements.length +elements.length];
            System.arraycopy(elements, 0, newArray, 0, elements.length);
            elements = newArray;
        }
        return elements.length;
    }

    @Override
    public boolean contains(String item) {
        for (String listItem: elements) {
            if (Objects.equals(listItem, item)) {
                return true;
            }
        }
        return false;
    }
}
