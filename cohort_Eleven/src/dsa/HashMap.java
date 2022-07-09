package dsa;

public class HashMap implements Map {
    private SetImplementation mapSet ;
    private ArrayList mapArr = new ArrayList();

        public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int p = 1, o = 1;
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < i; k++) {
                System.out.print(p++);
            }
            for (int m = 1; m <= i; m++) {
                System.out.print(o++);
            }
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
//
    }

    @Override
    public void put() {


    }
}
