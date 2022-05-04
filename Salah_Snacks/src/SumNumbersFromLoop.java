import java.util.Scanner;

public class SumNumbersFromLoop {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program will calculate the sum of two numbers");
        String decision;

        do {
            System.out.println("Enter first number: ");
            int firstNumber = scanner.nextInt();
            System.out.println("Enter second number: ");
            int secondNumber = scanner.nextInt();
            int total = firstNumber + secondNumber;
            System.out.format("The sum of the two numbers is %d.%n", total);
            System.out.println("Do you wish to repeat the operation? -> enter yes or no");
            decision = scanner.next();
        } while (decision.startsWith("y") || decision.startsWith("Y"));
    }
}
