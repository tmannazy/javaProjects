import java.util.Random;
import java.util.Scanner;

//    Generate a random number
//    Prompt user to guess the generated number
//    If the user's guess is higher than random number
//        Print "Too high, try again."
//    If the user's guess is lower than random number
//        Print "Too low, try again."
//    Repeat the process until user enters a correct number
//    Congratulate user for getting the random number



public class GuessRandomNumber {
    public static void main(String... args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess my hidden number if you fit try :) ");
        int randomNumber = random.nextInt(100);
        int userGuess = scanner.nextInt();

        while (userGuess != randomNumber) {
            if (userGuess > randomNumber) System.out.println("Too high, try again.\n");
            else System.out.println("Too low, try again.\n");
            System.out.print("Guess my hidden number if you fit try :) ");
            userGuess = scanner.nextInt();
        }
        System.out.format("%nCorreeeect! Your guess '%d' is my randomNumber %n.", userGuess);
    }
}
