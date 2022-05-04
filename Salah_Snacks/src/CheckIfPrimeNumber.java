import java.util.Scanner;

public class CheckIfPrimeNumber {
    public static void main(String... args) {
        int userInput, i, counter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        userInput = scanner.nextInt();

        for (i = 2; i < userInput; i++) {
            if (userInput % i == 0) {
                counter++;
                break;
            }
        }
        if (counter == 0) System.out.format("The number %d is a prime number.", userInput);
        else System.out.format("The number %d is not a prime number.", userInput);
    }
}
