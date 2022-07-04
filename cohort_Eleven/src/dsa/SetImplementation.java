package dsa;

import java.util.Objects;

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
//        if (setArr.size() == 0) {
//            setArr.add(item);
//        } else {
//            for (int i = 0; i < setArr.size(); i++) {
//                if (Objects.equals(setArr.get(i), item)) {
//                    break;
//                } else {
//                    setArr.add(item);
//                }
//            }
//        }


    }

    public int size() {
        return setArr.size();
    }
}
