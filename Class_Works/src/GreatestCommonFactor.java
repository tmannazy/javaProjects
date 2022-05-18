package src;

import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("THIS PROGRAM CALCULATES GCF OF TWO INTEGERS");
        System.out.print("Enter the first number: ");
        int firstNum = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNum = scanner.nextInt();
        int result = getGCF(firstNum, secondNum);
        System.out.format("The GCF of %d and %d is %d.%n", firstNum, secondNum, result);
    }

    private static int getGCF(int firstNum, int secondNum) {
        if (secondNum == 0) return firstNum;
        else return getGCF(secondNum, firstNum % secondNum);
    }
}
