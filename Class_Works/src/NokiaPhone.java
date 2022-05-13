package src;

import java.util.Scanner;

public class NokiaPhone {
    private static int getUserInput() {
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();
    }

    private static void displayMessage(String message) {
        System.out.println(message);
    }

    public static void main(String... args) {
        String prompt = """
                List of menu functions
                Select a number for menu
                1 -> Phone book
                2 -> Messages
                3 -> Chat
                4 -> Call register
                5 -> Tones
                6 -> Settings
                7 -> Call divert
                8 -> Games
                9 -> Calculator
                10 -> Reminders
                11 -> Clock
                12 -> Profiles
                13 -> SIM services
                0 -> Exit
                """;
        displayMessage(prompt);

        switch (getUserInput()) {
            case 1 -> showPhoneBookMenu();
            case 2 -> showMessagesMenu();
            case 3 -> showChatMenu();
            case 4 -> showCallMenu();
            case 5 -> showTonesMenu();
            case 6 -> showSettingsMenu();
            case 7 -> displayCallDivert();
            case 8 -> showGamesMenu();
            case 9 -> displayCalculator();
            case 10 -> displayReminders();
            case 11 -> showClockMenu();
            case 12 -> displayProfiles();
            case 13 -> displaySIMServices();
            case 0 -> exitCode();
        }
    }

    private static void exitCode() {
        System.exit(0);
    }

    private static void displaySIMServices() {
        displayMessage("SIM services");
        singleMenuMethods();
    }

    private static void displayProfiles() {
        displayMessage("Profiles");
        singleMenuMethods();
    }

    private static void showClockMenu() {
        String clockMenu = """
                1 -> Alarm clock
                2 -> Clock settings
                3 -> Date setting
                4 -> Stopwatch
                5 -> Countdown timer
                6 -> Auto update of date and time                               
                """;
        displayMessage(clockMenu);
        switch (getUserInput()) {
            case 1 -> displayMessage("Alarm clock");
            case 2 -> displayMessage("Clock settings");
            case 3 -> displayMessage("Date setting");
            case 4 -> displayMessage("Stopwatch");
            case 5 -> displayMessage("Countdown timer");
            case 6 -> displayMessage("Auto update of date and time");
        }
    }

    private static void displayReminders() {
        displayMessage("Reminders");
        singleMenuMethods();
    }

    private static void displayCalculator() {
        displayMessage("Calculator");
        singleMenuMethods();
    }

    private static void showGamesMenu() {
        displayMessage("Games");
        singleMenuMethods();
    }

    private static void displayCallDivert() {
        displayMessage("Call divert");
        singleMenuMethods();
    }

    private static void showSettingsMenu() {
        String settingsMenu = """
                1 -> Call settings
                2 -> Phone settings
                3 -> Security settings
                4 -> Restore factory settings
                """;
        displayMessage(settingsMenu);
        switch (getUserInput()) {
            case 1 -> {
                String callSettingsMenu = """
                        1 -> Automatic redial
                        2 -> Speed dialling
                        3 -> Call waiting options
                        4 -> Own number sending
                        5 -> Phone line in use
                        6 -> Automatic answer
                        """;
                displayMessage(callSettingsMenu);
                switch (getUserInput()) {
                    case 1 -> displayMessage("Automatic redial");
                    case 2 -> displayMessage("Speed dialling");
                    case 3 -> displayMessage("Call waiting options");
                    case 4 -> displayMessage("Own number sending");
                    case 5 -> displayMessage("Phone line in use");
                    case 6 -> displayMessage("Automatic answer");
                }
            }
            case 2 -> {
                String phoneSettingsMenu = """
                        1 -> Language
                        2 -> Cell info display
                        3 -> Welcome note
                        4 -> Network selection
                        5 -> Lights
                        6 -> Confirm SIM service actions
                        """;
                displayMessage(phoneSettingsMenu);
                switch (getUserInput()) {
                    case 1 -> displayMessage("Language");
                    case 2 -> displayMessage("Cell info display");
                    case 3 -> displayMessage("Welcome note");
                    case 4 -> displayMessage("Network selection");
                    case 5 -> displayMessage("Lights");
                    case 6 -> displayMessage("Confirm SIM service actions");
                }
            }
            case 3 -> {
                String securitySettingsMenu = """
                        1 -> PIN code request
                        2 -> Call barring service
                        3 -> Fixed dialling
                        4 -> Closed user group
                        5 -> Phone security
                        6 -> Change access codes
                        """;
                displayMessage(securitySettingsMenu);
                switch (getUserInput()) {
                    case 1 -> displayMessage("PIN code request");
                    case 2 -> displayMessage("Call barring service");
                    case 3 -> displayMessage("Fixed dialling");
                    case 4 -> displayMessage("Closed user group");
                    case 5 -> displayMessage("Phone security");
                    case 6 -> displayMessage("Change access codes ");
                }
            }
            case 4 -> displayMessage("Restore factory settings");
        }
    }

    private static void showTonesMenu() {
        String tonesMenu = """
                1 -> Ringing tone
                2 -> Ringing volume
                3 -> Incoming call alert
                4 -> Composer
                5 -> Message alert tone
                6 -> Keypad tones
                7 -> Warning and game tones
                8 -> Vibrating alert
                9 -> Screen saver
                """;
        displayMessage(tonesMenu);
        switch (getUserInput()) {
            case 1 -> displayMessage("Ringing tone");
            case 2 -> displayMessage("Ringing volume");
            case 3 -> displayMessage("Incoming call alert");
            case 4 -> displayMessage("Composer");
            case 5 -> displayMessage("Message alert tone");
            case 6 -> displayMessage("Keypad tones");
            case 7 -> displayMessage("Warning and game tones");
            case 8 -> displayMessage("Vibrating alert");
            case 9 -> displayMessage("Screen saver");
        }
    }

    private static void showCallMenu() {
        String callRegisterMenu = """
                1 -> Missed calls
                2 -> Received calls
                3 -> Dialled numbers
                4 -> Erase recent call lists
                5 -> Show call duration
                6 -> Show call costs
                7 -> Call cost settings
                8 -> Prepaid credit
                """;
        displayMessage(callRegisterMenu);
        switch (getUserInput()) {
            case 1 -> displayMessage("Missed calls");
            case 2 -> displayMessage("Received calls");
            case 3 -> displayMessage("Dialled numbers");
            case 4 -> displayMessage("Erase recent call lists");
            case 5 -> {
                String showCallDurationMenu = """
                        1 -> Last call duration
                        2 -> All calls' duration
                        3 -> Received calls' duration
                        4 -> Dialled calls' duration
                        5 -> Clear timers
                        """;
                displayMessage(showCallDurationMenu);
                switch (getUserInput()) {
                    case 1 -> displayMessage("Last call duration");
                    case 2 -> displayMessage("All calls' duration");
                    case 3 -> displayMessage("Received calls' duration");
                    case 4 -> displayMessage("Dialled calls' duration");
                    case 5 -> displayMessage("Clear timers");
                }
            }
            case 6 -> {
                String callCostMenu = """
                        1 -> Last call cost
                        2 -> All calls' cost
                        3 -> Clear counters
                        """;
                displayMessage(callCostMenu);
                switch (getUserInput()) {
                    case 1 -> displayMessage("Last call cost");
                    case 2 -> displayMessage("All calls' cost");
                    case 3 -> displayMessage("Clear counters");
                }
            }
            case 7 -> {
                String callCostSettings = """
                        1 -> Call cost limit
                        2 -> Show costs in
                        """;
                displayMessage(callCostSettings);
                switch (getUserInput()) {
                    case 1 -> displayMessage("Call cost limit");
                    case 2 -> displayMessage("Show costs in");
                }
            }
            case 8 -> displayMessage("Prepaid credit");
        }
    }

    private static void showChatMenu() {
        displayMessage("Chat");
        singleMenuMethods();
    }

    private static void showMessagesMenu() {
        String messagesPrompt = """
                1 -> Write messages
                2 -> Inbox
                3 -> Outbox
                4 -> Picture Messages
                5 -> Templates
                6 -> Smileys
                7 -> Message settings
                8 -> Info service
                9 -> Voice mailbox number
                10 -> Service command editor
                0 -> Back
                """;
        displayMessage(messagesPrompt);
        messagesMenuGroup();
    }

    private static void messagesMenuGroup() {
        switch (getUserInput()) {
            case 1 -> {
                displayMessage("Write messages");
                displayMessage(backButtonForSingleOptions());
                singleDisplayMessageBackMethod();
            }
            case 2 -> {
                displayMessage("Inbox");
                displayMessage(backButtonForSingleOptions());
                singleDisplayMessageBackMethod();
            }
            case 3 -> {
                displayMessage("Outbox");
                displayMessage(backButtonForSingleOptions());
                singleDisplayMessageBackMethod();
            }
            case 4 -> {
                displayMessage("Picture messages");
                displayMessage(backButtonForSingleOptions());
                singleDisplayMessageBackMethod();
            }
            case 5 -> {
                displayMessage("Templates");
                displayMessage(backButtonForSingleOptions());
                singleDisplayMessageBackMethod();
            }
            case 6 -> {
                displayMessage("Smileys");
                displayMessage(backButtonForSingleOptions());
                singleDisplayMessageBackMethod();
            }
            case 7 -> {
                case7MessageSettingGroup();
            }
            case 8 -> {
                displayMessage("Info service");
                displayMessage(backButtonForSingleOptions());
                singleDisplayMessageBackMethod();
            }
            case 9 -> {
                displayMessage("Voice mailbox number");
                displayMessage(backButtonForSingleOptions());
                singleDisplayMessageBackMethod();
            }
            case 10 -> {
                displayMessage("Service command editor");
                displayMessage(backButtonForSingleOptions());
                singleDisplayMessageBackMethod();
            }
            case 0 -> goBackToMainMenu();
        }
    }

    private static void singleDisplayMessageBackMethod() {
        switch (getUserInput()) {
            case 0 -> showMessagesMenu();
            case 1 -> goBackToMainMenu();
        }
    }

    private static void case7MessageSettingGroup() {
        String messageSettingsMenu = """
                1 -> Set 1
                2 -> Common
                0 -> Back
                """;
        displayMessage(messageSettingsMenu);
        messageSettingsGroup();
    }

    private static void messageSettingsGroup() {
        switch (getUserInput()) {
            case 1 -> set_1();
            case 2 -> common();
            case 0 -> showMessagesMenu();
        }
    }

    private static void common() {
        String commonMenu = """
                1 -> Delivery reports
                2 -> Reply via same centre
                3 -> Character support
                0 -> Back
                """;
        displayMessage(commonMenu);
        switch (getUserInput()) {
            case 1 -> {
                displayMessage("Delivery reports");
                displayMessage(backButtonForSingleOptions());
                commonMenuInnerDisplayMessagesBackMethod();
            }
            case 2 -> {
                displayMessage("Reply via same centre");
                displayMessage(backButtonForSingleOptions());
                commonMenuInnerDisplayMessagesBackMethod();
            }
            case 3 -> {
                displayMessage("Character support");
                displayMessage(backButtonForSingleOptions());
                commonMenuInnerDisplayMessagesBackMethod();
            }
            case 0 -> {
                case7MessageSettingGroup();
            }
        }
    }

    private static void set_1() {
        String set_1_Menu = """
                1 -> Message centre number
                2 -> Message sent as
                3 -> Message validity
                0 -> Back
                """;
        displayMessage(set_1_Menu);
        set_1_MenuGroup();
    }

    private static void set_1_MenuGroup() {
        switch (getUserInput()) {
            case 1 -> {
                displayMessage("Message centre number");
                displayMessage(backButtonForSingleOptions());
                set_1_InnerDisplayMessagesBackMethod();
            }
            case 2 -> {
                displayMessage("Message sent as");
                displayMessage(backButtonForSingleOptions());
                set_1_InnerDisplayMessagesBackMethod();
            }
            case 3 -> {
                displayMessage("Message validity");
                displayMessage(backButtonForSingleOptions());
                set_1_InnerDisplayMessagesBackMethod();
            }
            case 0 -> {
                case7MessageSettingGroup();
            }
        }
    }

    private static void set_1_InnerDisplayMessagesBackMethod() {
        switch (getUserInput()) {
            case 0 -> set_1();
            case 1 -> goBackToMainMenu();
        }
    }

    private static void commonMenuInnerDisplayMessagesBackMethod() {
        switch (getUserInput()) {
            case 0 -> common();
            case 1 -> goBackToMainMenu();
        }
    }

    private static void showPhoneBookMenu() {
        String phoneBookPrompt = """
                1 -> Search
                2 -> Service Nos.
                3 -> Add name
                4 -> Erase
                5 -> Edit
                6 -> Assign tone
                7 -> Send b'card
                8 -> Options
                9 -> Speed dials
                10-> Voice tags
                0 -> Back
                """;
        displayMessage(phoneBookPrompt);
        phoneBookMenuGroup();
    }

    private static void phoneBookMenuGroup() {
        switch (getUserInput()) {
            case 1 -> {
                displayMessage("Search");
                displayMessage(backButtonForSingleOptions());
                singleDisplayPhoneBookBackMethod();
            }
            case 2 -> {
                displayMessage("Service Nos.");
                displayMessage(backButtonForSingleOptions());
                singleDisplayPhoneBookBackMethod();
            }
            case 3 -> {
                displayMessage("Add name");
                displayMessage(backButtonForSingleOptions());
                singleDisplayPhoneBookBackMethod();
            }
            case 4 -> {
                displayMessage("Erase");
                displayMessage(backButtonForSingleOptions());
                singleDisplayPhoneBookBackMethod();

            }
            case 5 -> {
                displayMessage("Edit");
                displayMessage(backButtonForSingleOptions());
                singleDisplayPhoneBookBackMethod();
            }
            case 6 -> {
                displayMessage("Assign tone");
                displayMessage(backButtonForSingleOptions());
                singleDisplayPhoneBookBackMethod();
            }
            case 7 -> {
                displayMessage("Send b'card");
                displayMessage(backButtonForSingleOptions());
                singleDisplayPhoneBookBackMethod();
            }
            case 8 -> {
                String subMenu = """
                        1 -> Type of view
                        2 -> Memory status
                        0 -> Back
                        """;
                displayMessage(subMenu);
                switch (getUserInput()) {
                    case 1 -> {
                        displayMessage("Type of view");
                        displayMessage(backButtonForSingleOptions());
                        singleDisplayPhoneBookBackMethod();
                    }
                    case 2 -> {
                        displayMessage("Memory Status");
                        displayMessage(backButtonForSingleOptions());
                        singleDisplayPhoneBookBackMethod();
                    }
                    case 0 -> showPhoneBookMenu();
                }
            }
            case 9 -> {
                displayMessage("Speed dials");
                displayMessage(backButtonForSingleOptions());
                singleDisplayPhoneBookBackMethod();
            }
            case 10 -> {
                displayMessage("Voice tags");
                displayMessage(backButtonForSingleOptions());
                singleDisplayPhoneBookBackMethod();
            }
            case 0 -> goBackToMainMenu();
        }
    }

    private static String backButtonForSingleOptions() {
        return """
                0 -> Back
                1 -> Main Menu
                """;
    }

    private static void singleDisplayPhoneBookBackMethod() {
        switch (getUserInput()) {
            case 0 -> showPhoneBookMenu();
            case 1 -> goBackToMainMenu();
        }
    }

    private static void goBackToMainMenu() {
        main();
    }

    private static void singleMenuMethods() {
        displayMessage("0 -> Back");
        if (getUserInput() == 0) {
            main();
        }
    }
}