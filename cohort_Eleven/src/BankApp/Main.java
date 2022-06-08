package BankApp;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank;

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
            if (promptResponse == 0) {
                sentinel = 0;
            } else {
                switch (promptResponse) {
                    case 1 -> {
                        newUserMenu(scanner, bank, promptResponse);
                    }
                }
            }

//        private static int userAccountMenu (Scanner scanner, String pin, Account account){
//            int promptResponse;
//            String accountMenu = """
//                    1 -> To View Account Balance
//                    2 -> To Deposit Money
//                    3 -> To Withdraw Money
//                    0 -> To go back
//                    """;
//            System.out.println(accountMenu);
//            promptResponse = scanner.nextInt();
//            switch (promptResponse) {
//                case 1 -> {
//                    System.out.println(account.getBalance(pin));
//                    System.out.println("0 -> To go back");
//                    promptResponse = scanner.nextInt();
//                    if (promptResponse == 0) userAccountMenu(scanner, pin, account);
//                }
//                case 2 -> {
//                    System.out.print("Enter your deposit amount: ");
//                    promptResponse = scanner.nextInt();
//                    account.deposit(promptResponse);
//                    userAccountMenu(scanner, pin, account);
//                }
//            }
//            return promptResponse;
        }
    }

    private static void newUserMenu(Scanner scanner, Bank bank, int promptResponse) {
        int chooseGender;
        String email;
        String firstName = "";
        String lastName = "";
        int day;
        Account account;
        Gender gender;
        int month;
        String pin = "";
        Customer customer;
        String phoneNumber;
        int year;
        String accountMenu = """
                1 -> To Create Account
                2 -> To View Account Balance
                3 -> To Deposit Money
                4 -> To Withdraw Money
                0 -> To go back
                """;
        System.out.println(accountMenu);
        promptResponse = Integer.parseInt(scanner.nextLine());
        switch (promptResponse) {
//            case 0 -> mainMethodCall();
            case 1 -> {
                System.out.print("\nEnter your first name: ");
                firstName = scanner.nextLine();
                System.out.print("\nEnter your last name: ");
                lastName = scanner.nextLine();
                System.out.print("\nEnter your day of birth in digits: ");
                day = Integer.parseInt(scanner.nextLine());
                System.out.print("\nEnter your month of birth in digits: ");
                month = Integer.parseInt(scanner.nextLine());
                System.out.print("\nEnter your year of birth: ");
                year = Integer.parseInt(scanner.nextLine());
                String genderSelection = """
                        Choose your gender
                        1 -> MALE
                        2 -> FEMALE
                        3 -> NON BINARY
                        """;
                System.out.println(genderSelection);
                chooseGender = Integer.parseInt(scanner.nextLine());
                if (chooseGender == 1) gender = Gender.MALE;
                else if (chooseGender == 2) gender = Gender.FEMALE;
                else gender = Gender.NONBINARY;
                System.out.print("\nEnter your email: ");
                email = scanner.nextLine();
                System.out.print("\nEnter your 4 digit secret pin: ");
                pin = scanner.nextLine();
                System.out.print("\nEnter your phone number: ");
                phoneNumber = scanner.nextLine();
                System.out.println("Account successfully created.");
                customer = new Customer(firstName, lastName, day, month, year, gender, email, pin, phoneNumber);
                bank.addNewCustomer(customer);
                new Account(AccountTypes.SAVINGS, customer, pin);
            }

            case 2 -> {
                System.out.println(customer.getAccountInfo(lastName + " "+firstName).toString());
                        System.out.println("0 -> To go back");
                if (promptResponse == 0) newUserMenu(scanner, bank, promptResponse);
            }

            case 3 -> //                        promptResponse = scanner.nextInt();
                //                            account.deposit(promptResponse);
                //                        userAccountMenu(scanner, pin, account);
                //                            promptResponse = userAccountMenu(scanner, pin, account);
                    System.out.print("Enter your deposit amount: ");
        }
    }
}
