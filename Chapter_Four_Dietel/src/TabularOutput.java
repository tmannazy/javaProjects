import java.awt.font.TextAttribute;

public class TabularOutput {
    public static void main(String... args) {
        for (int i = 1, n = 1; i <= 5; i++, n++) {
            for (int j = 1; j <= 4; j++) {
                if (i == 1) System.out.print("N\t\t");
            }

            for (int k = 1; k <= 4; k++) {
                int p = n;
//                if (i == 1) {System.out.print(n * n);
//                }
                if (i >= 2) System.out.print(p++ * i + "\t\t");
            }
                System.out.println();
        }
    }
}
