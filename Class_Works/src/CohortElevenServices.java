package src;

import java.util.Scanner;

public class CohortElevenServices {
    private static int getUserInput() {
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();
    }

    public static void main(String... args) {
        System.out.println("This program allows a native to make a choice of Semicolon services.");
        System.out.println("Choose a number from the options below.");
        String prompt = """
                1 -> English
                2 -> Igbo
                3 -> French
                4 -> Yoruba
                """;
        System.out.println(prompt);

        switch (getUserInput()) {
            case 1 -> showEnglishServices();
            case 2 -> showIgboServices();
            case 3 -> showFrenchServices();
            case 4 -> showYorubaServices();
            default -> System.out.println("Please select from either number 1 - 4");
        }
    }

    private static void showYorubaServices() {
        System.out.println("Choose a number from the options.");
        System.out.println("1 -> Ewa \n2 -> Agoyin");

        switch (getUserInput()) {
            case 1 -> System.out.println("Ewa");
            case 2 -> System.out.println("Agoyin");
        }
    }

    private static void showFrenchServices() {
        System.out.println("Choose a number from the options.");
        System.out.println("1 -> Egg \n2 -> Champagne");
        switch (getUserInput()) {
            case 1 -> System.out.println("Egg");
            case 2 -> System.out.println("Champagne");
        }
    }

    private static void showIgboServices() {

        System.out.println("Choose a number from the options.");
        System.out.println("""
                1 -> Sharing
                2 -> Caring
                """);

        switch (getUserInput()) {
            case 1 -> System.out.println("Sharing");
            case 2 -> System.out.println("Caring");
        }
    }

    private static void showEnglishServices() {
        System.out.println("Choose a number from the options.");
        System.out.println("1 -> Data \n2 -> Transfer");
        switch (getUserInput()) {
            case 1 -> System.out.println("Data");
            case 2 -> System.out.println("Transfer");
        }
    }
}
