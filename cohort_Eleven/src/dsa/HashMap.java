package dsa;

public class HashMap implements Map {
    private SetImplementation mapKeysSet = new SetImplementation();
    private SetImplementation mapValuesSet = new SetImplementation();
    private ArrayList mapKeys = new ArrayList();
    private ArrayList mapValues = new ArrayList();

//        public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            int p = 1, o = 1;
//            for (int j = i; j < 5; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k < i; k++) {
//                System.out.print(p++);
//            }
//            for (int m = 1; m <= i; m++) {
//                System.out.print(o++);
//            }
//            for (int j = 1; j < i; j++) {
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
////
//    }

    @Override
    public void put(String key, String value) {
        mapKeys.add(key);
        mapValues.add(value);
    }

    @Override
    public boolean isEmpty() {
        if (mapKeys.size() == 0) {
            return true;
        } else {
            for (int i = 0; i < mapKeys.size(); i++) {
                for (int j = 0; j < mapValues.size(); j++) {
                    if (j == i && mapValues.get(j).isEmpty() && mapKeys.get(i).isEmpty()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public int size() {
        return mapKeys.size();
    }

    @Override
    public boolean containsKey(Object key) {
        for (int i = 0; i < mapKeys.size(); i++) {
            if (mapKeys.get(i) == key) {
                return true;
            }
        }
        return false;

    }

    @Override
    public boolean containsValue(Object value) {
        for (int i = 0; i < mapValues.size(); i++) {
            if (mapValues.get(i) == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String get(Object key) {
        for (int i = 0; i < mapKeys.size(); i++) {
            if (mapKeys.get(i) == key) {
                return mapValues.get(i);
            }
        }
        return null;
    }

    @Override
    public String keySet() {
        for (int i = 0; i < mapKeys.size(); i++) {
            mapKeysSet.add(mapKeys.get(i));
        }
        return mapKeysSet.toString();
    }

    @Override
    public void clear() {
        mapKeys.setSize();
        mapValues.setSize();
    }

    @Override
    public void remove(Object key) {
        for (int i = 0; i < mapKeys.size(); i++) {
            if (mapKeys.get(i) == key) {
                mapKeys.remove(key);
                mapValues.remove(mapValues.get(i));
                break;
            }
        }
    }

    @Override
    public String values() {
        for (int i = 0; i < mapValues.size(); i++) {
            mapValuesSet.add(mapValues.get(i));
        }
        return mapValuesSet.toString();
    }
}
