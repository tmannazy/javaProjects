import java.util.Scanner;

public class LargestNumber {
    public static void main(String... args) {
        System.out.println("This program will display the largest number user entered after 10x.");
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        System.out.printf("Enter %dst number: ", counter);
        int number = scanner.nextInt();
        int largest = 0;

        while (counter < 10) {
            counter++;
                String unit = switch (counter) {
                    case 2 -> "nd";
                    case 3 -> "rd";
                    default -> "th";
                };
            if (number > largest) largest = number;
            System.out.printf("Enter %d%s number : ", counter, unit );
            number = scanner.nextInt();
        }
        System.out.println("The largest number found is " + largest);
    }
}