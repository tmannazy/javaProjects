package dsa;

public class StackImplementation {
    private int size;
    private String[] stack;

    public StackImplementation(int size) {
        this.stack = new String[size];
    }

    public boolean empty() {
        return size == 0;
    }

    public void push(String element) {
        if (size < stack.length) {
            stack[size++] = element;
        } else {
            throw new IllegalArgumentException("You can't add item to the stack");
        }
    }

    public String peek() {
        return getLastElement();
    }

    public String pop() {
        return getLastElement();
    }

    private String getLastElement() {
        String lastElement = null;
        for (int i = 0; i < stack.length; i++) {
            if (stack[i] == null) {
                lastElement = stack[i - 1];
                stack[i - 1] = null;
                break;
            } else if (stack[i] != null) {
                lastElement = stack[stack.length - 1];
                stack[stack.length - 1] = null;
            }
        }
        return lastElement;
    }

    public int search(Object element) {
        for (int i = 0; i < stack.length;i++) {
            if (stack[i] == element) {
                return i+1;
            }
        }
        return -1;
    }

    public int size() {
        int counter = 0;
        for (String s : stack) {
            if (s != null) {
                counter++;
            }
        }
        return counter;
    }
}
