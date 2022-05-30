import java.util.Scanner;

public class SpecifiedSum {
    public static void main(String... args) {
        System.out.println("This program reads first number entered and checks if subsequent numbers equals it or greater than it");
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int total = 0;
        while (!(total >= userInput)) {
            System.out.print("Enter a number:");
            int secondUserInput = scanner.nextInt();
            total += secondUserInput;
        }
    }
}
