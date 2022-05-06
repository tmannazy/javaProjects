import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String... args) {
        System.out.println("This program will display two largest numbers user entered after 10x.");
        Scanner scanner = new Scanner(System.in);
        int counter = 2;
        System.out.print("Enter 1st number: ");
        int number = scanner.nextInt();
        int firstLargest = 0;
        int secondLargest = 0;

        while (counter <= 10) {
            String unit = switch (counter) {
                case 2 -> "nd";
                case 3 -> "rd";
                default -> "th";
            };

            if (number > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = number;
            } else if (number > secondLargest)
                secondLargest = number;

            System.out.printf("Enter %d%s number : ", counter, unit);
            number = scanner.nextInt();
            counter++;

            if (counter == 11) {
                if (number > firstLargest) {
                    secondLargest = firstLargest;
                    firstLargest = number;
                } else if (number > secondLargest)
                    secondLargest = number;
            }
        }

        System.out.println("The first largest number found is " + firstLargest);
        System.out.println("The second largest number found is " + secondLargest);
    }
}
