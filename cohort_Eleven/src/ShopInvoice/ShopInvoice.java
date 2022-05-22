package ShopInvoice;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ShopInvoice {
    private ArrayList<String> shoppingCart;
    private ArrayList<Integer> storeNumberOfItemsFromTheCart;
    private ArrayList<Integer> storeUnitPriceOfAnItem;
    private double discountOnCustomerPurchase;
    private double vatRate;
    private double balance;
    private String agentName;
    private String customerName;
    private int amountPaid;

    public ShopInvoice() {
        this.shoppingCart = new ArrayList<>();
        this.storeNumberOfItemsFromTheCart = new ArrayList<>();
        this.storeUnitPriceOfAnItem = new ArrayList<>();
    }

    public void enterCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void addNewItem(String nameOfItemPurchased) {
        shoppingCart.add(nameOfItemPurchased);
    }

    public String checkItem(String nameOfItemPurchased) {
        for (String item : shoppingCart) {
            if (item.equals(nameOfItemPurchased)) return item;
        }
        return "Item not found";
    }

    public void numberOfItemInCart(int numberOfItems) {
        this.storeNumberOfItemsFromTheCart.add(numberOfItems);
    }

    public int getNumberOfAnItemPurchased(int index) {
        for (int i = 0; i < storeNumberOfItemsFromTheCart.size(); i++) {
            if (index == i) return storeNumberOfItemsFromTheCart.get(i);
        }
        return 0;
    }

    public void unitPriceOfAnItem(int price) {
        this.storeUnitPriceOfAnItem.add(price);
    }

    public double getUnitPriceOfAnItem(int index) {
        for (int i = 0; i < storeUnitPriceOfAnItem.size(); i++) {
            if (index == i) return storeUnitPriceOfAnItem.get(i);
        }
        return 0;
    }

    public void addAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getAgentName() {
        return agentName;
    }

    public double getDiscount() {
        return discountOnCustomerPurchase;
    }

    public void setDiscount(double discountRate) {
        double subTotal = getSubTotalOfPurchasedItems();
        this.discountOnCustomerPurchase = ((discountRate % 100) / 100.0) * subTotal;
    }

    public double getSubTotalOfPurchasedItems() {
        double sum = 0;
        for (int i = 0; i < storeUnitPriceOfAnItem.size(); i++) {
            double unitPrice = getUnitPriceOfAnItem(i);
            int numberOfItem = getNumberOfAnItemPurchased(i);
            sum += unitPrice * numberOfItem;
        }
        return sum;
    }

    public void vatValue() {
        double subTotal = getSubTotalOfPurchasedItems();
        this.vatRate = (((17.50 * 100 / 10000)) * subTotal);
    }

    public double getVATValue() {
        return vatRate;
    }

    public double getTotalBill() {
        return getVATValue() + (getSubTotalOfPurchasedItems() - getDiscount());
    }

    public void calculateBalanceFromAmountCustomerPaid(int amountCustomerPaid) {
        this.amountPaid = amountCustomerPaid;
        double totalBill = getTotalBill();
        this.balance = amountCustomerPaid - totalBill;
    }

    public double getAmountCustomerPaid() {
        return amountPaid;
    }

    public double getBalance() {
        return balance;
    }

    public void topOfPrintOut() {
        String top = """
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                TEL: +234 801 234 5678""";
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy hh:mm:ss a");
        String dateString = dateFormat.format(date);
        System.out.println(top);
        System.out.println("Date: " + dateString);
        System.out.println("Cashier: " + getAgentName());
        System.out.println("Customer Name: " + getCustomerName());
    }

    public void bottomOfPrintOut() {
        partOneBottomPrintOut();
        loopAndPrintLines();
        System.out.println();
        System.out.printf("%47s %s", "THIS IS NOT AN RECEIPT KINDLY PAY", getTotalBill());
        System.out.println();
        loopAndPrintLines();
    }

    private void partOneBottomPrintOut() {
        loopAndPrintLines();
        System.out.println();
        System.out.printf("%25s %7s %7s %13s", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
        System.out.println();
        for (int l = 0; l < 55; l++) {
            System.out.print("_");
        }
        System.out.println();
        for (int i = 0; i < shoppingCart.size(); i++) {
            System.out.printf("%25s %5s %10.2f %12.2f%n", shoppingCart.get(i), getNumberOfAnItemPurchased(i),
                    getUnitPriceOfAnItem(i), getUnitPriceOfAnItem(i) * getNumberOfAnItemPurchased(i));
        }
        for (int l = 0; l < 55; l++) {
            System.out.print("_");
        }
        System.out.println();
        for (int k = 0; k < 1; k++) {
            System.out.printf("%39s %15.2f%n", "Sub Total:", getSubTotalOfPurchasedItems());
            System.out.printf("%39s %15.2f%n", "Discount:", getDiscount());
            System.out.printf("%39s %15.2f%n", "VAT @ 17.50%:", getVATValue());
        }

        loopAndPrintLines();
        System.out.println();
        System.out.printf("%39s %15.2f%n", "Bill Total:", getTotalBill());
    }

    private void loopAndPrintLines() {
        for (int j = 0; j < 55; j++) {
            System.out.print("=");
        }
    }

    public void finalPrintOut() {
        partOneBottomPrintOut();
        System.out.printf("%39s %15.2f%n", "Amount Paid:", getAmountCustomerPaid());
        System.out.printf("%39s %15.2f%n", "Balance:", getBalance());
        loopAndPrintLines();
        System.out.println();
        System.out.printf("%43s", "THANK YOU FOR YOUR PATRONAGE");
        System.out.println();
        loopAndPrintLines();
    }
}

