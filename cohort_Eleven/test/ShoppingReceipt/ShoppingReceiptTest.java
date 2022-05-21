package ShoppingReceipt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ShoppingReceiptTest {
    ShoppingReceipt receipt;
    private String nameOfItemPurchased;
    private String secondNameOfItemPurchased;

    @BeforeEach
    void setUp() {
        receipt = new ShoppingReceipt();
    }

    @Test
    void saveCustomersNameTest() {
        String customerName = "Mana";
        receipt.enterCustomerName(customerName);
        assertEquals("Mana", receipt.checkCustomerName(customerName));
    }

    @Test
    void customerCanAddItemsTest() {
        nameOfItemPurchased = "Golden Morn";
        receipt.addNewItem(nameOfItemPurchased);
        assertTrue(receipt.checkItem(nameOfItemPurchased));
        secondNameOfItemPurchased = "Cornflakes";
        receipt.addNewItem(secondNameOfItemPurchased);
        assertTrue(receipt.checkItem(secondNameOfItemPurchased));
    }

    @Test
    void numberOfPiecesOfAnItemACustomerBoughtTest() {
        nameOfItemPurchased = "Bible";
        receipt.addNewItem(nameOfItemPurchased);
        assertTrue(receipt.checkItem(nameOfItemPurchased));
        int numberOfItems = 5;
        receipt.numberOfItemInCart(numberOfItems);
        assertEquals(5, receipt.getNumberOfAnItemPurchased(0));
        secondNameOfItemPurchased = "Ancient & Modern";
        receipt.addNewItem(secondNameOfItemPurchased);
        assertTrue(receipt.checkItem(secondNameOfItemPurchased));
        int numberOfSecondItems = 2;
        receipt.numberOfItemInCart(numberOfSecondItems);
        assertEquals(2, receipt.getNumberOfAnItemPurchased(1));
    }

//    @Test
//    void indexOfPurchasedItemTest() {
//        nameOfItemPurchased = "Laptop";
//        receipt.addNewItem(nameOfItemPurchased);
//        ArrayList<String> arrayOfList = receipt.getShoppingList();
//        assertEquals(0, receipt.getIndexOfPurchasedItem(nameOfItemPurchased));
//        secondNameOfItemPurchased = "Ancient & Modern";
//        receipt.addNewItem(secondNameOfItemPurchased);
//        assertEquals(1, receipt.getIndexOfPurchasedItem(secondNameOfItemPurchased));
//    }

    @Test
    void unitPriceForItemInCartTest() {
        nameOfItemPurchased = "Laptop";
        receipt.addNewItem(nameOfItemPurchased);
        assertTrue(receipt.checkItem(nameOfItemPurchased));
        int price = 320;
        receipt.unitPriceOfAnItem(price);
        assertEquals(320, receipt.getUnitOfAnItem(0));
    }

    @Test
    void saveAgentNameTest() {
        String agentName = "Mofe Dayo";
        receipt.addAgentName(agentName);
        assertEquals("Mofe Dayo", receipt.getAgentName(agentName));
    }

    @Test
    void percentageDiscountOnItemsPurchasedTest() {
        nameOfItemPurchased = "Bible";
        secondNameOfItemPurchased = "Ancient & Modern";
        int numberOfItems = 5;
        int numberOfSecondItems = 2;
        int price = 320;
        int secondPrice = 8000;
        double discount = 2;
        receipt.addNewItem(nameOfItemPurchased);
        receipt.addNewItem(secondNameOfItemPurchased);
        receipt.numberOfItemInCart(numberOfItems);
        receipt.numberOfItemInCart(numberOfSecondItems);
        receipt.unitPriceOfAnItem(price);
        receipt.unitPriceOfAnItem(secondPrice);
        receipt.setDiscount(discount);
        receipt.getSubTotalOfPurchasedItems();
        assertEquals(352, receipt.getDiscount());
    }

    @Test
    void sumAllPurchasedItemsTest() {
        nameOfItemPurchased = "Bible";
        secondNameOfItemPurchased = "Ancient & Modern";
        int numberOfItems = 5;
        int numberOfSecondItems = 2;
        int price = 320;
        int secondPrice = 8000;
        receipt.addNewItem(nameOfItemPurchased);
        receipt.addNewItem(secondNameOfItemPurchased);
        receipt.numberOfItemInCart(numberOfItems);
        receipt.numberOfItemInCart(numberOfSecondItems);
        receipt.unitPriceOfAnItem(price);
        receipt.unitPriceOfAnItem(secondPrice);
        double subTotal = receipt.getSubTotalOfPurchasedItems();
        System.out.println(subTotal);
        assertEquals(17_600.00, subTotal);
    }

    @Test
    void calculateVATTest() {
        nameOfItemPurchased = "Bible";
        secondNameOfItemPurchased = "Ancient & Modern";
        int numberOfItems = 5;
        int numberOfSecondItems = 2;
        int price = 320;
        int secondPrice = 8000;
        receipt.addNewItem(nameOfItemPurchased);
        receipt.addNewItem(secondNameOfItemPurchased);
        receipt.numberOfItemInCart(numberOfItems);
        receipt.numberOfItemInCart(numberOfSecondItems);
        receipt.unitPriceOfAnItem(price);
        receipt.unitPriceOfAnItem(secondPrice);
        receipt.vatValue();
        assertEquals(3_080, receipt.getVATValue());
    }

    @Test
    void totalBillTest() {
        nameOfItemPurchased = "Bible";
        secondNameOfItemPurchased = "Ancient & Modern";
        String thirdNameOfItemPurchased = "Ekpere Na Abu";
        int numberOfItems = 3;
        int numberOfSecondItems = 1;
        int numberOfThirdItems = 2;
        int price = 500;
        int secondPrice = 250;
        int thirdPrice = 50;
        receipt.addNewItem(nameOfItemPurchased);
        receipt.addNewItem(secondNameOfItemPurchased);
        receipt.addNewItem(thirdNameOfItemPurchased);
        receipt.numberOfItemInCart(numberOfItems);
        receipt.numberOfItemInCart(numberOfSecondItems);
        receipt.numberOfItemInCart(numberOfThirdItems);
        receipt.unitPriceOfAnItem(price);
        receipt.unitPriceOfAnItem(secondPrice);
        receipt.unitPriceOfAnItem(thirdPrice);
        receipt.setDiscount(2);
        receipt.vatValue();
        assertEquals(2136.75, receipt.getTotalBill());
    }

    @Test
    void amountCustomerPaidTest() {
        nameOfItemPurchased = "Bible";
        secondNameOfItemPurchased = "Ancient & Modern";
        String thirdNameOfItemPurchased = "Ekpere Na Abu";
        int numberOfItems = 3;
        int numberOfSecondItems = 1;
        int numberOfThirdItems = 2;
        int price = 500;
        int secondPrice = 250;
        int thirdPrice = 50;
        int amountCustomerPaid = 2200;
        receipt.addNewItem(nameOfItemPurchased);
        receipt.addNewItem(secondNameOfItemPurchased);
        receipt.addNewItem(thirdNameOfItemPurchased);
        receipt.numberOfItemInCart(numberOfItems);
        receipt.numberOfItemInCart(numberOfSecondItems);
        receipt.numberOfItemInCart(numberOfThirdItems);
        receipt.unitPriceOfAnItem(price);
        receipt.unitPriceOfAnItem(secondPrice);
        receipt.unitPriceOfAnItem(thirdPrice);
        receipt.setDiscount(2);
        receipt.vatValue();
        receipt.getTotalBill();
        receipt.calculateBalanceFromAmountCustomerPaid(amountCustomerPaid);

        assertEquals(63.25, receipt.getBalance());
    }

}