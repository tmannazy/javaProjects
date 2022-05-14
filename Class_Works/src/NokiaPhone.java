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
                LIST OF MENU FUNCTIONS
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
                CLOCK
                1 -> Alarm clock
                2 -> Clock settings
                3 -> Date setting
                4 -> Stopwatch
                5 -> Countdown timer
                6 -> Auto update of date and time
                0 -> Back
                """;
        displayMessage(clockMenu);
        switch (getUserInput()) {
            case 1 -> {
                displayMessage("Alarm clock");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showClockMenu();
            }
            case 2 -> {
                displayMessage("Clock settings");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showClockMenu();
            }
            case 3 -> {
                displayMessage("Date setting");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showClockMenu();
            }
            case 4 -> {
                displayMessage("Stopwatch");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showClockMenu();
            }
            case 5 -> {
                displayMessage("Countdown timer");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showClockMenu();
            }
            case 6 -> {
                displayMessage("Auto update of date and time");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showClockMenu();
            }
            case 0 -> goBackToMainMenu();
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
                SETTINGS
                1 -> Call settings
                2 -> Phone settings
                3 -> Security settings
                4 -> Restore factory settings
                0 -> Back
                """;
        displayMessage(settingsMenu);
        switch (getUserInput()) {
            case 1 -> callSettingsCase1Menu();
            case 2 -> callSettingsCase2Menu();
            case 3 -> callSettingsCase3Menu();
            case 4 -> {
                displayMessage("Restore factory settings");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showSettingsMenu();
            }
            case 0 -> goBackToMainMenu();
        }
    }

    private static void callSettingsCase3Menu() {
        String securitySettingsMenu = """
                SECURITY SETTINGS
                1 -> PIN code request
                2 -> Call barring service
                3 -> Fixed dialling
                4 -> Closed user group
                5 -> Phone security
                6 -> Change access codes
                0 -> Back
                """;
        displayMessage(securitySettingsMenu);
        switch (getUserInput()) {
            case 1 -> {
                displayMessage("PIN code request");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) callSettingsCase3Menu();
            }
            case 2 -> {
                displayMessage("Call barring service");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) callSettingsCase3Menu();
            }
            case 3 -> {
                displayMessage("Fixed dialling");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) callSettingsCase3Menu();
            }
            case 4 -> {
                displayMessage("Closed user group");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) callSettingsCase3Menu();
            }
            case 5 -> {
                displayMessage("Phone security");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) callSettingsCase3Menu();
            }
            case 6 -> {
                displayMessage("Change access codes ");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) callSettingsCase3Menu();
            }
            case 0 -> showSettingsMenu();
        }
    }

    private static void callSettingsCase2Menu() {
        String phoneSettingsMenu = """
                PHONE SETTINGS
                1 -> Language
                2 -> Cell info display
                3 -> Welcome note
                4 -> Network selection
                5 -> Lights
                6 -> Confirm SIM service actions
                0 -> Back
                """;
        displayMessage(phoneSettingsMenu);
        switch (getUserInput()) {
            case 1 -> {
                displayMessage("Language");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) callSettingsCase2Menu();
            }
            case 2 -> {
                displayMessage("Cell info display");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) callSettingsCase2Menu();
            }
            case 3 -> {
                displayMessage("Welcome note");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) callSettingsCase2Menu();
            }
            case 4 -> {
                displayMessage("Network selection");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) callSettingsCase2Menu();
            }
            case 5 -> {
                displayMessage("Lights");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) callSettingsCase2Menu();
            }
            case 6 -> {
                displayMessage("Confirm SIM service actions");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) callSettingsCase2Menu();
            }
            case 0 -> showSettingsMenu();
        }
    }

    private static void callSettingsCase1Menu() {
        String callSettingsMenu = """
                CALL SETTINGS
                1 -> Automatic redial
                2 -> Speed dialling
                3 -> Call waiting options
                4 -> Own number sending
                5 -> Phone line in use
                6 -> Automatic answer
                0 -> Back
                """;
        displayMessage(callSettingsMenu);
        switch (getUserInput()) {
            case 1 -> {
                displayMessage("Automatic redial");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) callSettingsCase1Menu();
            }
            case 2 -> {
                displayMessage("Speed dialling");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) callSettingsCase1Menu();
            }
            case 3 -> {
                displayMessage("Call waiting options");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) callSettingsCase1Menu();
            }
            case 4 -> {
                displayMessage("Own number sending");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) callSettingsCase1Menu();
            }
            case 5 -> {
                displayMessage("Phone line in use");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) callSettingsCase1Menu();
            }
            case 6 -> {
                displayMessage("Automatic answer");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) callSettingsCase1Menu();
            }
            case 0 -> showSettingsMenu();
        }
    }

    private static void showTonesMenu() {
        String tonesMenu = """
                TONES
                1 -> Ringing tone
                2 -> Ringing volume
                3 -> Incoming call alert
                4 -> Composer
                5 -> Message alert tone
                6 -> Keypad tones
                7 -> Warning and game tones
                8 -> Vibrating alert
                9 -> Screen saver
                0 -> Back
                """;
        displayMessage(tonesMenu);
        switch (getUserInput()) {
            case 1 -> {
                displayMessage("Ringing tone");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showTonesMenu();
            }
            case 2 -> {
                displayMessage("Ringing volume");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showTonesMenu();
            }
            case 3 -> {
                displayMessage("Incoming call alert");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showTonesMenu();
            }
            case 4 -> {
                displayMessage("Composer");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showTonesMenu();
            }
            case 5 -> {
                displayMessage("Message alert tone");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showTonesMenu();
            }
            case 6 -> {
                displayMessage("Keypad tones");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showTonesMenu();
            }
            case 7 -> {
                displayMessage("Warning and game tones");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showTonesMenu();
            }
            case 8 -> {
                displayMessage("Vibrating alert");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showTonesMenu();
            }
            case 9 -> {
                displayMessage("Screen saver");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showTonesMenu();
            }
            case 0 -> goBackToMainMenu();
        }
    }

    private static void showCallMenu() {
        String callRegisterMenu = """
                CALL REGISTER
                1 -> Missed calls
                2 -> Received calls
                3 -> Dialled numbers
                4 -> Erase recent call lists
                5 -> Show call duration
                6 -> Show call costs
                7 -> Call cost settings
                8 -> Prepaid credit
                0 -> Back
                """;
        displayMessage(callRegisterMenu);
        switch (getUserInput()) {
            case 1 -> {
                displayMessage("Missed calls");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showCallMenu();
            }
            case 2 -> {
                displayMessage("Received calls");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showCallMenu();
            }
            case 3 -> {
                displayMessage("Dialled numbers");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showCallMenu();
            }
            case 4 -> {
                displayMessage("Erase recent call lists");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showCallMenu();
            }
            case 5 -> callRegisterMenu();
            case 6 -> callCostMenu();
            case 7 -> callCostSettingsMenu();
            case 8 -> {
                displayMessage("Prepaid credit");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showCallMenu();
            }
            case 0 -> goBackToMainMenu();
        }
    }

    private static void callCostSettingsMenu() {
        String callCostSettings = """
                CALL COST SETTINGS
                1 -> Call cost limit
                2 -> Show costs in
                0 -> Back
                """;
        displayMessage(callCostSettings);
        switch (getUserInput()) {
            case 1 -> {
                displayMessage("Call cost limit");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) callCostSettingsMenu();
            }
            case 2 -> {
                displayMessage("Show costs in");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) callCostSettingsMenu();
            }
            case 0 -> showCallMenu();
        }
    }

    private static void callCostMenu() {
        String callCostMenu = """
                SHOW CALL COSTS
                1 -> Last call cost
                2 -> All calls' cost
                3 -> Clear counters
                0 -> Back
                """;
        displayMessage(callCostMenu);
        switch (getUserInput()) {
            case 1 -> {
                displayMessage("Last call cost");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) callCostMenu();
            }
            case 2 -> {
                displayMessage("All calls' cost");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) callCostMenu();
            }
            case 3 -> {
                displayMessage("Clear counters");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) callCostMenu();
            }
            case 0 -> showCallMenu();
        }
    }

    private static void callRegisterMenu() {
        String showCallDurationMenu = """
                SHOW CALL DURATION
                1 -> Last call duration
                2 -> All calls' duration
                3 -> Received calls' duration
                4 -> Dialled calls' duration
                5 -> Clear timers
                0 -> Back
                """;
        displayMessage(showCallDurationMenu);
        switch (getUserInput()) {
            case 1 -> {
                displayMessage("Last call duration");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) callRegisterMenu();
            }
            case 2 -> {
                displayMessage("All calls' duration");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) callRegisterMenu();
            }
            case 3 -> {
                displayMessage("Received calls' duration");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) callRegisterMenu();
            }
            case 4 -> {
                displayMessage("Dialled calls' duration");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) callRegisterMenu();
            }
            case 5 -> {
                displayMessage("Clear timers");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) callRegisterMenu();
            }
            case 0 -> showCallMenu();
        }
    }

    private static void showChatMenu() {
        displayMessage("Chat");
        singleMenuMethods();
    }

    private static void showMessagesMenu() {
        String messagesPrompt = """
                MESSAGES
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
        switch (getUserInput()) {
            case 1 -> {
                displayMessage("Write messages");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showMessagesMenu();
            }
            case 2 -> {
                displayMessage("Inbox");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showMessagesMenu();
            }
            case 3 -> {
                displayMessage("Outbox");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showMessagesMenu();
            }
            case 4 -> {
                displayMessage("Picture messages");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showMessagesMenu();
            }
            case 5 -> {
                displayMessage("Templates");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showMessagesMenu();
            }
            case 6 -> {
                displayMessage("Smileys");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showMessagesMenu();
            }
            case 7 -> messageSettingsGroup();
            case 8 -> {
                displayMessage("Info service");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showMessagesMenu();
            }
            case 9 -> {
                displayMessage("Voice mailbox number");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showMessagesMenu();
            }
            case 10 -> {
                displayMessage("Service command editor");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showMessagesMenu();
            }
            case 0 -> goBackToMainMenu();
        }
    }

    private static void messageSettingsGroup() {
        String messageSettingsMenu = """
                MESSAGE SETTINGS
                1 -> Set 1
                2 -> Common
                0 -> Back
                """;
        displayMessage(messageSettingsMenu);
        switch (getUserInput()) {
            case 1 -> set1MenuGroup();
            case 2 -> common();
            case 0 -> showMessagesMenu();
        }
    }

    private static void set1MenuGroup() {
        String set_1_Menu = """
                SET 1
                1 -> Message centre number
                2 -> Message sent as
                3 -> Message validity
                0 -> Back
                """;
        displayMessage(set_1_Menu);
        switch (getUserInput()) {
            case 1 -> {
                displayMessage("Message centre number");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) set1MenuGroup();
            }
            case 2 -> {
                displayMessage("Message sent as");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) set1MenuGroup();
            }
            case 3 -> {
                displayMessage("Message validity");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) set1MenuGroup();
            }
            case 0 -> messageSettingsGroup();
        }
    }

    private static void common() {
        String commonMenu = """
                COMMON
                1 -> Delivery reports
                2 -> Reply via same centre
                3 -> Character support
                0 -> Back
                """;
        displayMessage(commonMenu);
        switch (getUserInput()) {
            case 1 -> {
                displayMessage("Delivery reports");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) common();
            }
            case 2 -> {
                displayMessage("Reply via same centre");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) common();
            }
            case 3 -> {
                displayMessage("Character support");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) common();
            }
            case 0 -> messageSettingsGroup();
        }
    }

    private static void showPhoneBookMenu() {
        String phoneBookPrompt = """
                PHONEBOOK MENU
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
        switch (getUserInput()) {
            case 1 -> {
                displayMessage("Search");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showPhoneBookMenu();
            }
            case 2 -> {
                displayMessage("Service Nos.");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showPhoneBookMenu();
            }
            case 3 -> {
                displayMessage("Add name");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showPhoneBookMenu();
            }
            case 4 -> {
                displayMessage("Erase");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showPhoneBookMenu();

            }
            case 5 -> {
                displayMessage("Edit");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showPhoneBookMenu();
            }
            case 6 -> {
                displayMessage("Assign tone");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showPhoneBookMenu();
            }
            case 7 -> {
                displayMessage("Send b'card");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showPhoneBookMenu();
            }
            case 8 -> phonebookOptions();
            case 9 -> {
                displayMessage("Speed dials");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showPhoneBookMenu();
            }
            case 10 -> {
                displayMessage("Voice tags");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) showPhoneBookMenu();
            }
            case 0 -> goBackToMainMenu();
        }
    }

    private static void phonebookOptions() {
        String subMenu = """
                OPTIONS
                1 -> Type of view
                2 -> Memory status
                0 -> Back
                """;
        displayMessage(subMenu);
        switch (getUserInput()) {
            case 1 -> {
                displayMessage("Type of view");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) phonebookOptions();
            }
            case 2 -> {
                displayMessage("Memory Status");
                displayMessage("0 -> Back");
                if (getUserInput() == 0) phonebookOptions();
            }
            case 0 -> showPhoneBookMenu();
        }
    }

    private static void goBackToMainMenu() {
        main();
    }

    private static void singleMenuMethods() {
        displayMessage("0 -> Back");
        if (getUserInput() == 0) main();
    }
}