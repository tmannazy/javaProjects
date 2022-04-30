package tdd;/*
    Prompt user to enter a score
    if the score user entered is greater than 55
    print an output "PASS!" to the user as feedback
    if the score user entered is lesser than 55
    print an output "FAIL!" to the user as feedback
 */

import java.util.Scanner;

public class CheckScore {
    public static void main(String... args) {
        Scanner getInput = new Scanner(System.in);
        System.out.print("Enter a score: ");
        int userScore = getInput.nextInt();
        int storedNumber = 55;

        if (userScore >= storedNumber)
            System.out.println("PASS!");

        if (userScore < storedNumber)
            System.out.println("FAIL!");
    }
}
