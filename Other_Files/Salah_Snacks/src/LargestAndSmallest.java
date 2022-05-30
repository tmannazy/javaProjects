import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String... args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter range of numbers: (Type ',' to quit) ");
            int largest = scanner.nextInt();
            int smallest = largest;

            while (scanner.hasNextInt()) {
                int userInput = scanner.nextInt();
                largest = Math.max(largest, userInput);
                smallest = Math.min(smallest, userInput);
            }

            System.out.format("The largest value is %d.%n", largest);
            System.out.format("The smallest value is %d.%n", smallest);
        } catch (Exception error) {
            throw new RuntimeException("Enter a correct number");
        }
    }
}
