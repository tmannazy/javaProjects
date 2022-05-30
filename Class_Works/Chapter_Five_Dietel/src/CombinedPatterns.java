public class CombinedPatterns {
//    Question 5.22
    public static void main(String... args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int k = 1; k <= 3; k++) {
                System.out.print(" ");
            }

            for (int l = i; l <= 10; l++) {
                System.out.print(" ");
            }

            for (int m = i; m <= 10; m++) {
                System.out.print("*");
            }

            for (int n = 1; n <= i; n++) {
                System.out.print(" ");
            }

            for (int o = 1; o < i; o++) {
                System.out.print(" ");
            }

            for (int p = i; p <= 10; p++) {
                System.out.print("*");
            }

            for (int q = i; q <= 13; q++) {
                System.out.print(" ");
            }

            for (int r = 1; r <= i; r++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
