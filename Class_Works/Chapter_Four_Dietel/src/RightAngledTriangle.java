import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program displays a right angled triangle of any length entered");
        System.out.print("Enter the length of triangle base: ");
        int userInput = scanner.nextInt();

        if (userInput > 0 && userInput <= 10) {
            for (int i = 1; i <= userInput; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else System.out.println("Enter a number between 1 and 10");
    }
}
