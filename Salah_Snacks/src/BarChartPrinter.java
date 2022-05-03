import java.util.Scanner;

public class BarChartPrinter {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five numbers between 1 and 30");
        int numberRange = 5;
        int serialNumber = 0;
        int[] listOfNumbers = new int[numberRange];

        while (serialNumber < numberRange) {
            System.out.format("Enter number %d: ", serialNumber + 1);
            int input = scanner.nextInt();
            if (input >= 1 && input <= 30) {
                listOfNumbers[serialNumber++] = input;
            } else {
                System.out.println("The number you entered is not within range.");
            }
        }
        printBarChart(listOfNumbers);
    }

    private static void printBarChart(int[] listOfNumbers) {
        for (int listOfNumber : listOfNumbers) {
            System.out.printf("%d: ", listOfNumber);
            for (int column = 0; column < listOfNumber; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
