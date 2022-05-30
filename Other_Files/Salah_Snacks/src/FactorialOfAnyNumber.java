import java.util.Scanner;

public class FactorialOfAnyNumber {
    public static void main(String... args) {
        System.out.println("This program calculates the factorial of any number entered.");
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int factorialTotal = 1;
        for (int i = userInput; i > 0; i--) {
            factorialTotal *= i;
        }
        System.out.format("The factorial value of the number %d is %d.",
                userInput, factorialTotal);
    }
}
