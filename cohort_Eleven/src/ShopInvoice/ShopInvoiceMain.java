package ShopInvoice;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ShopInvoiceMain {
    public static void main(String... args) {
        ShopInvoice getPurchaseData = new ShopInvoice();
        Scanner scanner = new Scanner(System.in);
        String userResponseStringValue;
        int userResponseIntValue = 0;
        char sentinel = 'n';
        System.out.println("THIS PROGRAM PRINTS OUT A SHOPPING CART INVOICE FOR CUSTOMER.");
        System.out.println("What is the customer's name?");
        userResponseStringValue = scanner.nextLine();
        getPurchaseData.enterCustomerName(userResponseStringValue);

        try {
            while (!(userResponseStringValue.toLowerCase().charAt(0) == sentinel)) {
                System.out.println("What did customer buy?");
                userResponseStringValue = scanner.nextLine();
                getPurchaseData.addNewItem(userResponseStringValue);
                System.out.println("How many pieces? ");
                try {
                    userResponseIntValue = scanner.nextInt();
                } catch (InputMismatchException error) {
                    System.out.println("Kindly supply number of pieces");
                    userResponseIntValue = scanner.nextInt();
                }
                getPurchaseData.numberOfItemInCart(userResponseIntValue);

                System.out.println("How much per unit? ");
                userResponseIntValue = scanner.nextInt();
                getPurchaseData.unitPriceOfAnItem(userResponseIntValue);

                System.out.println("Are there more items to add? y/n");
                userResponseStringValue = scanner.next();
                scanner.nextLine();
            }
            System.out.println("What is your name?");
            userResponseStringValue = scanner.nextLine();
            getPurchaseData.addAgentName(userResponseStringValue);

            System.out.println("How much discount will customer get?");
            userResponseIntValue = scanner.nextInt();
            getPurchaseData.setDiscount(userResponseIntValue);
            getPurchaseData.vatValue();
            System.out.println("\n\n");
            getPurchaseData.topOfPrintOut();
            getPurchaseData.bottomOfPrintOut();
            System.out.println("\n\nHow much did customer give to you?");
            userResponseIntValue = scanner.nextInt();
            System.out.println("\n\n");
            getPurchaseData.calculateBalanceFromAmountCustomerPaid(userResponseIntValue);
            getPurchaseData.topOfPrintOut();
            getPurchaseData.finalPrintOut();
        } catch (InputMismatchException error) {
            System.out.println("Kindly enter correct value");
            System.out.println("\n");
            main();
        }
    }
}

