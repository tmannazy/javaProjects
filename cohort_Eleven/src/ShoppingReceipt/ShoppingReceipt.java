package ShoppingReceipt;

import java.util.ArrayList;
import java.util.Objects;

public class ShoppingReceipt {
    private ArrayList<String> shoppingCart;
    private ArrayList<String> customerList;
    private ArrayList<Integer> storeNumberOfItemsFromTheCart;
    private ArrayList<Integer> storeUnitPriceOfAnItem;
    private String[] storeAgentNames;
    private double discountOnCustomerPurchase;
    private double vatRate;
    private double balance;

    public ShoppingReceipt() {
        this.shoppingCart = new ArrayList<>();
        this.customerList = new ArrayList<>();
        this.storeNumberOfItemsFromTheCart = new ArrayList<>();
        this.storeUnitPriceOfAnItem = new ArrayList<>();
        this.storeAgentNames = new String[5];
    }

    public ArrayList<String> getShoppingList() {
        return shoppingCart;
    }

    public void enterCustomerName(String customerName) {
        customerList.add(customerName);
    }

    public String checkCustomerName(String customerName) {
        for (String customer : customerList) {
            if (customer.equals(customerName)) return customerName;
        }
        return "Name not found.";
    }

    public void addNewItem(String nameOfItemPurchased) {
        shoppingCart.add(nameOfItemPurchased);
    }

    public boolean checkItem(String nameOfItemPurchased) {
        for (String item : shoppingCart) {
            if (item.equals(nameOfItemPurchased)) return true;
        }
        return false;
    }

    public void numberOfItemInCart(int numberOfItems) {
        this.storeNumberOfItemsFromTheCart.add(numberOfItems);
    }

    public int getNumberOfAnItemPurchased(int index) {
        for (int i = 0; i < storeNumberOfItemsFromTheCart.size(); i++) {
            if(index == i) return storeNumberOfItemsFromTheCart.get(i);
        }
        return 0;
    }

    public void unitPriceOfAnItem(int price) {
        this.storeUnitPriceOfAnItem.add(price);
    }

    public int getUnitOfAnItem(int index) {
        for (int i = 0; i < storeUnitPriceOfAnItem.size(); i++) {
            if(index == i) return storeUnitPriceOfAnItem.get(i);
        }
        return 0;
    }

    public void addAgentName(String agentName) {
        for (int i = 0; i < storeAgentNames.length; i++) {
            if(storeAgentNames[i] == null) this.storeAgentNames[i] = agentName;
        }
    }

    public String getAgentName(String agentName) {
        for (String agent : storeAgentNames) {
            if(Objects.equals(agentName, agent)) return agent;
        }
        return "Agent doesn't exit";
    }

    public void setDiscount(double discountRate) {
       double subTotal = getSubTotalOfPurchasedItems();
        this.discountOnCustomerPurchase = ((discountRate % 100) / 100.0) * subTotal;
    }

    public double getDiscount() {
        return discountOnCustomerPurchase;
    }

    public double getSubTotalOfPurchasedItems() {
        double sum = 0;
        for (int i = 0; i < storeUnitPriceOfAnItem.size(); i++) {
            double unitPrice = getUnitOfAnItem(i);
            int numberOfItem = getNumberOfAnItemPurchased(i);
            sum += unitPrice * numberOfItem;
        }
        return sum;
    }

    public int getIndexOfPurchasedItem(String nameOfItemPurchased) {
        for (int i = 0; i < shoppingCart.size(); i++) {
            if (nameOfItemPurchased.equals(shoppingCart.get(i))) {
                return shoppingCart.indexOf(i);
            }
        }
        return 0;
    }

    public void vatValue() {
        double subTotal = getSubTotalOfPurchasedItems();
        this.vatRate = (((17.50 * 100 / 10000)) * subTotal);
    }

    public double getVATValue() {
        return vatRate;
    }

    public double getTotalBill() {
        return getVATValue() +(getSubTotalOfPurchasedItems() - getDiscount());
    }

    public void calculateBalanceFromAmountCustomerPaid(int amountCustomerPaid) {
        double totalBill = getTotalBill();
        this.balance = amountCustomerPaid - totalBill;
    }

    public double getBalance() {
    return balance;
    }
}
