package BankApp;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank;
    private static Customer customer;
    private static Account account;

    public static void main(String... args) {
        bank = new Bank();
        System.out.println("THIS PROGRAM DEMO BANK SERVICES FOR A USER");
        int sentinel = -1;
        String prompt = """
                MAIN MENU
                1 -> New User
                2 -> To User Account Menu
                3 -> To Close Account
                0 -> To Exit
                """;
        while (sentinel != 0) {
            System.out.println(prompt);
            int promptResponse = Integer.parseInt(scanner.nextLine());
            if (promptResponse == 0) sentinel = 0;
            else {
                switch (promptResponse) {
                    case 1 -> newUserMenu();
                    case 2 -> userDataMenu();

                }
            }
        }
    }

    private static void newUserMenu() {
        Gender gender;
        String createAccountMenu = """
                1 -> Enter 1 to Create New Account
                """;
        System.out.println(createAccountMenu);
        int promptResponse = Integer.parseInt(scanner.nextLine());
        if (promptResponse == 1) {
            System.out.print("\nEnter your first name: ");
            String firstName = scanner.nextLine();
            System.out.print("\nEnter your last name: ");
            String lastName = scanner.nextLine();
            System.out.print("\nEnter your day of birth in digits: ");
            int day = Integer.parseInt(scanner.nextLine());
            System.out.print("\nEnter your month of birth in digits: ");
            int month = Integer.parseInt(scanner.nextLine());
            System.out.print("\nEnter your year of birth: ");
            int year = Integer.parseInt(scanner.nextLine());
            System.out.println();
            String genderSelection = """
                    Choose your gender
                    1 -> MALE
                    2 -> FEMALE
                    3 -> NON BINARY
                    """;
            System.out.println(genderSelection);
            int chooseGender = Integer.parseInt(scanner.nextLine());
            if (chooseGender == 1) gender = Gender.MALE;
            else if (chooseGender == 2) gender = Gender.FEMALE;
            else gender = Gender.NONBINARY;
            System.out.print("\nEnter your email: ");
            String email = scanner.nextLine();
            System.out.print("\nEnter your 4 digit secret pin: ");
            String pin = scanner.nextLine();
            System.out.print("\nEnter your phone number: ");
            String phoneNumber = scanner.nextLine();
            System.out.println("Account successfully created.");
            System.out.println();
            customer = new Customer(firstName, lastName, day, month, year, gender, email, pin, phoneNumber);
            account = new Account(AccountTypes.SAVINGS, customer, pin);
            customer.addNewAccount(account);
            bank.addNewCustomer(customer);
        }
    }

    public static void userDataMenu() {
        String dataMenu = """
                1 -> To View Account Balance
                2 -> To Deposit Money
                3 -> To Withdraw Money
                0 -> To go back
                """;
        System.out.println(dataMenu);
        int promptResponse = Integer.parseInt(scanner.nextLine());
        switch (promptResponse) {
            case 1 -> {
                System.out.print("Enter your last name and first name: ");
                String userResponse = scanner.nextLine();
                userResponse = userResponse.toLowerCase();
                System.out.print("\nEnter your pin: ");
                String pin = scanner.nextLine();
                customer = bank.getCustomerNameDetails(userResponse);
                System.out.println(customer.checkBalance(userResponse, pin));
                System.out.println();
            }

            case 2 -> {
                System.out.print("Enter your last name and first name: ");
                String userResponse = scanner.nextLine();
                System.out.print("Enter your deposit amount: ");
                int amount = Integer.parseInt(scanner.nextLine());
                customer.depositMoney(userResponse, amount);
                System.out.println("The sum of " + amount + " successfully deposited.");
                System.out.println();
            }
        }
    }
}
