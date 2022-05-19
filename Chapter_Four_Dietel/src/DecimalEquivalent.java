import java.util.Scanner;

public class DecimalEquivalent {
    public static void main(String... args) {
        System.out.print("Enter five numbers: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int binaryInteger = 0;
        int finalValue = 0;
        int counter = 0;
        while (counter <= 5) {
            binaryInteger = userInput % 10;
            userInput = userInput / 10;
            finalValue += binaryInteger * Math.pow(2, counter);
            counter++;
        }
        System.out.println(finalValue);
    }
}
