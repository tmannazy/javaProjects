import java.util.Scanner;

public class Palindromes {
    public static void main(String... args) {
        System.out.println("This program checks if the digits entered is a palindrome.");
        System.out.println("Enter the digits one after another.");
        Scanner scanner = new Scanner(System.in);
        int[] numList = new int[5];
        int counter = 0;

        while (counter < 5) {
            System.out.format("Enter digit %d: ", counter + 1);
            int userInput = scanner.nextInt();
            numList[counter++] = userInput;
            if (counter != 5) System.out.println("Must be up to five digits.");
        }

        int concatenateNum = 0;
        for (int num : numList) {
            concatenateNum = 10 * concatenateNum + num;
        }

        int checkedNum = concatenateNum;
        int reversedNum = 0;
        int storedModValue = 0;

        while (checkedNum > 0) {
            storedModValue = checkedNum % 10;
            checkedNum = checkedNum / 10;
            reversedNum = reversedNum * 10 + storedModValue;
        }

        if (concatenateNum == reversedNum) System.out.println(concatenateNum + " is a palindrome.");
        else System.out.println(concatenateNum + " is not a palindrome.");
    }
}
