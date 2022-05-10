public class CheckerBoardPatternPrinter {
    public static void main(String... args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 8; j++) {
                System.out.print("*  ");
            }
            System.out.println();
            for (int k = 1; k <= 8; k++) {
                System.out.print(" ");
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
