import java.util.Scanner;

public class PositiveNegativeAndZeros {
    public static void main(String... args) {
        System.out.println("Enter a number or -1 to quit: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;
        int counter = 0;

        while (userInput != -1) {
            if (userInput > 1) posCount += 1;
            else if (userInput < 0) negCount += 1;
            else zeroCount += 1;
            counter++;
            System.out.println("Enter a number or -1 to quit: ");
            userInput = scanner.nextInt();
        }
        System.out.format("Positive numbers entered = %d%nNegative numbers entered = %d%nZeros entered = %d%n",
                posCount, negCount, zeroCount);
    }
}

