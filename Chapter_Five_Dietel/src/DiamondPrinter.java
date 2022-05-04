public class DiamondPrinter {
    public static void main(String... args) {
        for (int i = 1; i < 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            for (int l = 1; l < i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int a = 1; a <= 5; a++) {
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

