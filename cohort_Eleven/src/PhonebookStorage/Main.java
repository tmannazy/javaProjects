package PhonebookStorage;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static User user;

    static private ArrayList<User> listOfUsers = new ArrayList<>();

    public static void main(String[] args) {
        enterMenu();
    }

    private static void enterMenu() {
        System.out.print("""
                                
                MENU
                1 -> Admin
                2 -> User Login
                3 -> Show Contacts
                0 -> Exit
                Enter Option Number To Continue
                >""");
        int sentinel = -1;
        int userResponse = Integer.parseInt(scanner.nextLine());

        while (sentinel != 0) {
            if (userResponse == 0) {
                sentinel = userResponse;
            } else {
                switch (userResponse) {
                    case 1 -> adminMenu();
                    case 2 -> userLogin();
                    case 3 -> defaultContacts();
                }
            }
        }
        System.exit(0);
    }

    private static void defaultContacts() {
    }

    private static void userLogin() {
        System.out.println("Enter your first name");
        String firstName = scanner.nextLine();
        System.out.println("Enter your pin");
        String pin = scanner.nextLine();
        try {
            for (User listOfUser : listOfUsers) {
                if (listOfUser.isPinCorrect(firstName, pin)) {
                    System.out.println("Logged in successfully");
                    userMenu(listOfUser);
                }
            }
        } catch (IllegalArgumentException err) {
            System.out.println(err.getMessage());
        }
    }

    private static void userMenu(User user) {
        System.out.print("""
                                
                1 -> Create New Contact
                2 -> View Contacts
                3 -> Edit Contact
                4 -> Edit Contact Email
                5 -> Edit Contact Phone Number
                >""");

        int userResponse = Integer.parseInt(scanner.nextLine());
        switch (userResponse) {
            case 1 -> {
                System.out.println("Enter first name");
                String firstName = scanner.nextLine();
                System.out.println("Enter last name");
                String lastName = scanner.nextLine();
                System.out.println("Enter phone number");
                String phoneNumber = scanner.nextLine();
                System.out.println("Enter location");
                String address = scanner.nextLine();
                System.out.println("Enter email address");
                String email = scanner.nextLine();
                Contact contact = new Contact(firstName, lastName, phoneNumber, address, email);
                user.addNewContact(contact);
                System.out.println("Contact successfully saved to Phonebook");
                userMenu(user);
            }
            case 2 -> {
                int counter = 0;
                int link = 0;
                System.out.printf("%n%s'S CONTACT LIST = %d%n", user.getFirstName().toUpperCase(),
                        user.getPhonebookContactList().get(link).getListOfContacts().size());
                for (Phonebook phonebook : user.getPhonebookContactList()) {
                    for (int i = 0; i < phonebook.getListOfContacts().size(); i++) {
                        link = i;
                        System.out.printf("""
                                                                                    
                                        Contact %d
                                        First Name: %s
                                        Last Name: %s
                                        Phone Number: %s
                                        Address: %s
                                        Email: %s
                                                                        
                                        """,
                                ++counter,
                                phonebook.getListOfContacts().get(i).getFirstName(),
                                phonebook.getListOfContacts().get(i).getLastName(),
                                phonebook.getListOfContacts().get(i).getPhoneNumber(),
                                phonebook.getListOfContacts().get(i).getAddress(),
                                phonebook.getListOfContacts().get(i).getEmail());
                    }
                    break;
                }
                userMenu(user);
            }
        }
    }

    private static void adminMenu() {
        System.out.print("""
                                
                ADMIN MENU
                1 -> Create New User
                2 -> Delete User
                3 -> List All Users
                0 -> Go Back
                >""");

        int userResponse = Integer.parseInt(scanner.nextLine());
        switch (userResponse) {
            case 1 -> {
                System.out.println("\nEnter new user First Name");
                String firstName = scanner.nextLine();
                System.out.println("Enter new user Last Name");
                String lastName = scanner.nextLine();
                System.out.println("Enter pin");
                String pin = scanner.nextLine();
                user = new User(firstName, lastName, pin);
                listOfUsers.add(user);
                System.out.println("New phone user " + firstName.toUpperCase() + " " + lastName.toUpperCase() + " successfully created");
            }

            case 2 -> {
                displayUsers();
                System.out.println("Enter user's name to remove");
                String userToRemove = scanner.nextLine();
                System.out.println("Enter User pin");
                String userPinToRemove = scanner.nextLine();
                removeUser(userToRemove, userPinToRemove);
                System.out.println("User " + userToRemove.toUpperCase() + " successfully removed.");
            }

            case 3 -> displayUsers();
            case 0 -> enterMenu();
        }

    }

    private static void displayUsers() {
        int counter = 0;
        if (listOfUsers.size() != 0) {
            for (User listOfUser : listOfUsers) {
                System.out.printf("""
                                            
                        User %d
                        First Name: %s
                        Last Name: %s
                                            
                        """, ++counter, listOfUser.getFirstName(), listOfUser.getLastName());
            }
        } else {
            System.out.println("No user existing. Add new user.");
        }

    }

    public static void removeUser(String name, String pin) {
        for (int i = 0; i < listOfUsers.size(); i++) {
            if (listOfUsers.get(i).isPinCorrect(name, pin) && Objects.equals(listOfUsers.get(i).getFirstName(), name)) {
                listOfUsers.remove(listOfUsers.get(i));
                break;
            }

        }
    }
}
