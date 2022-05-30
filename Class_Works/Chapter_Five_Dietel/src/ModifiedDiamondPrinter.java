public class ModifiedDiamondPrinter {
    public static void main(String... args) {
        for (int p = 1; p < 19; p++) {
            if (!(p % 2 == 0)) {
                for (int j = p; j <= 5; j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= p; k++) {
                    System.out.print("*");
                }

                for (int l = 1; l < p; l++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        for (int a = 1; a <= 19; a++) {
            if (!(a % 2 == 0)) {
                for (int b = 1; b <= a; b++) {
                    System.out.print(" ");
                }

                for (int c = a; c <= 5; c++) {
                    System.out.print("*");
                }

                for (int d = a; d < 5; d++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}



