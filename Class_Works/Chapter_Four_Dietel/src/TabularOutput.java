public class TabularOutput {
    public static void main(String... args) {
        System.out.println("N\t\tN2\t\tN3\t\tN4");
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            int p = 1;
            for (int k = 1; k <= 4; k++) {
                if (i == 1) System.out.print(i * i + "\t\t");
                if (i >= 2) {
                    p *= i;
                    System.out.print(p + "\t\t");
                }
            }
            System.out.println();
        }
    }
}
