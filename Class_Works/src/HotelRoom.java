package src;

import java.util.Scanner;

public class HotelRoom {
    private static final String[] roomsInHotel = new String[5];

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("THIS PROGRAM IS FOR CUSTOMERS TO BOOK A ROOM");
        String prompt = """
                Enter 1 to Book a room
                Enter 2 to Leave a room
                Enter 3 to Check details of a room
                Enter 0 to Exit
                """;
        System.out.println(prompt);

        int getUserInput = scanner.nextInt();
        while (getUserInput != 0) {
            switch (getUserInput) {
                case 1 -> {
                    for (int i = 0; i < roomsInHotel.length; i++) {
                        if (roomsInHotel[i] == null) System.out.printf("Room %d is empty.%n", i + 1);
                        else System.out.printf("Room %d is booked!%n", i + 1);
                    }
                    System.out.print("Enter 6 to go back or select room number to book? ");

                    getUserInput = scanner.nextInt();
                    for (int i = 0; i < roomsInHotel.length; i++) {
                        if (getUserInput - 1 == i) {
                            System.out.print("Enter your name: ");
                            String userName = scanner.next();
                            roomsInHotel[i] = userName;
                            System.out.println("Successfully booked!");
                        } else if (getUserInput == 6) {
                            System.out.println();
                            main();
                        }
                    }
                    System.out.println("Stop!!! You can't crash the system. Choose from the list of options below.");
                }
                case 2 -> {
                    System.out.print("Kindly enter your room number: ");
                    getUserInput = scanner.nextInt();
                    try {
                        if (roomsInHotel[getUserInput - 1] != null) {
                            roomsInHotel[getUserInput - 1] = null;
                            System.out.println("Thanks for your patronage. Kindly call again :)");
                        } else if (roomsInHotel[getUserInput - 1] == null)
                            System.out.println("This room is empty.");
                        else System.out.println("This room is booked!");
                    } catch (Exception err) {
                        System.out.println("Kindly enter a valid room number.");
                    }
                }
                case 3 -> {
                    System.out.print("We have " + roomsInHotel.length + " rooms. " +
                                     "Which room number do you wanna check? ");
                    getUserInput = scanner.nextInt();
                    try {
                        if (roomsInHotel[getUserInput - 1] != null) {
                            System.out.printf("Sorry, room %d is already booked.", getUserInput);
                        } else System.out.println("This room is empty. You can book it!");
                    } catch (ArrayIndexOutOfBoundsException error) {
                        System.out.println("Sorry, you've selected an unavailable room. Enter 1 to see all rooms");
                    }
                }
            }
            System.out.println("\n");
            System.out.println(prompt);
            getUserInput = scanner.nextInt();
        }
    }
}

