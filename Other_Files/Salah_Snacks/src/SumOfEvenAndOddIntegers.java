import java.util.Scanner;

public class SumOfEvenAndOddIntegers {
    public static void main(String... args) {
        System.out.println("This program will display sum of even and odd numbers entered");
        System.out.print("Enter any key to continue or ',' to quit: ");
        Scanner scanner = new Scanner(System.in);
        String entry = scanner.next();
        int sumOfEvenNumbers = 0, sumOfOddNumbers = 0, serialNumber = 0;

        while (!entry.equals(",")) {
            System.out.format("Enter number %d: ", serialNumber + 1);
            if (scanner.hasNextInt()) {
                int userInput = scanner.nextInt();
                if (userInput % 2 == 0) sumOfEvenNumbers += userInput;
                else sumOfOddNumbers += userInput;
            } else if (scanner.hasNext()) {
                System.out.println("Here's your result");
                break;
            }
            serialNumber++;
        }
        System.out.println("The sum of the even numbers is " + sumOfEvenNumbers);
        System.out.println("The sum of the odd numbers is " + sumOfOddNumbers);
    }
}
