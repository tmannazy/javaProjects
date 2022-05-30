public class NumberHillPattern {
    public static void main(String... args) {
        int space = 5;
        for (int rows = 1; rows <= space; rows++) {
            for (int column = rows; column <= space; column++) {
                System.out.print(" ");
            }
            for (int o = 1; o < rows; o++) {
                System.out.print("*");
            }
            for (int o = 1; o <= rows; o++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int m = 1, d = 1; m <= space; m++, d++) {
            for (int n = m; n <= space; n++) {
                System.out.print(" ");
            }

            int r = d;
            for (int o = 1; o < m; o++) {
                System.out.print(r-- + "");
            }

            for (int p = 1, q = 1; p <= m; p++, q++) {
                System.out.print(q + "");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1, t = 1; i <= space; i++, t++) {
            for (int n = i; n <= space; n++) {
                System.out.print(" ");
            }

            for (int o = 1; o < i; o++) {
                System.out.print(t + "");
            }

            for (int p = 1; p <= i; p++) {
                System.out.print(t + "");
            }
            System.out.println();
        }
    }
}
