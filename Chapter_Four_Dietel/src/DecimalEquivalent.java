import java.util.Scanner;

public class DecimalEquivalent {
    public static void main(String... args) {
        System.out.println("THIS PROGRAM DISPLAY DECIMAL VALUE OF UP TO \n5 BINARY NUMBERS ENTERED");
        System.out.print("Enter less than or up to five numbers: ");
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
