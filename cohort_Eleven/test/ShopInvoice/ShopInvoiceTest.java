package ShopInvoice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShopInvoiceTest {
    ShopInvoice shopInvoice;
    private String nameOfItemPurchased;
    private String secondNameOfItemPurchased;

    @BeforeEach
    void setUp() {
        shopInvoice = new ShopInvoice();
    }

    @Test
    void saveCustomersNameTest() {
        String customerName = "Mana";
        shopInvoice.enterCustomerName(customerName);
        assertEquals("Mana", shopInvoice.getCustomerName());
    }

    @Test
    void customerCanAddItemsTest() {
        nameOfItemPurchased = "Golden Morn";
        shopInvoice.addNewItem(nameOfItemPurchased);
        assertEquals("Golden Morn", shopInvoice.checkItem(nameOfItemPurchased));
        secondNameOfItemPurchased = "Cornflakes";
        shopInvoice.addNewItem(secondNameOfItemPurchased);
        assertEquals("Cornflakes",shopInvoice.checkItem(secondNameOfItemPurchased));
    }

    @Test
    void numberOfPiecesOfAnItemACustomerBoughtTest() {
        nameOfItemPurchased = "Bible";
        shopInvoice.addNewItem(nameOfItemPurchased);
        assertEquals("Bible",shopInvoice.checkItem(nameOfItemPurchased));
        int numberOfItems = 5;
        shopInvoice.numberOfItemInCart(numberOfItems);
        assertEquals(5, shopInvoice.getNumberOfAnItemPurchased(0));
        secondNameOfItemPurchased = "Ancient & Modern";
        shopInvoice.addNewItem(secondNameOfItemPurchased);
        assertEquals("Ancient & Modern", shopInvoice.checkItem(secondNameOfItemPurchased));
        int numberOfSecondItems = 2;
        shopInvoice.numberOfItemInCart(numberOfSecondItems);
        assertEquals(2, shopInvoice.getNumberOfAnItemPurchased(1));
    }

    @Test
    void unitPriceForItemInCartTest() {
        nameOfItemPurchased = "Laptop";
        shopInvoice.addNewItem(nameOfItemPurchased);
        assertEquals("Laptop",shopInvoice.checkItem(nameOfItemPurchased));
        int price = 320;
        shopInvoice.unitPriceOfAnItem(price);
        assertEquals(320, shopInvoice.getUnitPriceOfAnItem(0));
    }

    @Test
    void saveAgentNameTest() {
        String agentName = "Mofe Dayo";
        shopInvoice.addAgentName(agentName);
        assertEquals("Mofe Dayo", shopInvoice.getAgentName());
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
        shopInvoice.addNewItem(nameOfItemPurchased);
        shopInvoice.addNewItem(secondNameOfItemPurchased);
        shopInvoice.numberOfItemInCart(numberOfItems);
        shopInvoice.numberOfItemInCart(numberOfSecondItems);
        shopInvoice.unitPriceOfAnItem(price);
        shopInvoice.unitPriceOfAnItem(secondPrice);
        shopInvoice.setDiscount(discount);
        shopInvoice.getSubTotalOfPurchasedItems();
        assertEquals(352, shopInvoice.getDiscount());
    }

    @Test
    void sumAllPurchasedItemsTest() {
        nameOfItemPurchased = "Bible";
        secondNameOfItemPurchased = "Ancient & Modern";
        int numberOfItems = 5;
        int numberOfSecondItems = 2;
        int price = 320;
        int secondPrice = 8000;
        shopInvoice.addNewItem(nameOfItemPurchased);
        shopInvoice.addNewItem(secondNameOfItemPurchased);
        shopInvoice.numberOfItemInCart(numberOfItems);
        shopInvoice.numberOfItemInCart(numberOfSecondItems);
        shopInvoice.unitPriceOfAnItem(price);
        shopInvoice.unitPriceOfAnItem(secondPrice);
        assertEquals(17_600.00, shopInvoice.getSubTotalOfPurchasedItems());
    }

    @Test
    void calculateVATTest() {
        nameOfItemPurchased = "Bible";
        secondNameOfItemPurchased = "Ancient & Modern";
        String thirdNameOfItemPurchased = "Ekpere Na Abu";
        int numberOfItems = 3;
        int numberOfSecondItems = 1;
        int numberOfThirdItems = 2;
        int price = 500;
        int secondPrice = 250;
        int thirdPrice = 50;
        shopInvoice.addNewItem(nameOfItemPurchased);
        shopInvoice.addNewItem(secondNameOfItemPurchased);
        shopInvoice.addNewItem(thirdNameOfItemPurchased);
        shopInvoice.numberOfItemInCart(numberOfItems);
        shopInvoice.numberOfItemInCart(numberOfSecondItems);
        shopInvoice.numberOfItemInCart(numberOfThirdItems);
        shopInvoice.unitPriceOfAnItem(price);
        shopInvoice.unitPriceOfAnItem(secondPrice);
        shopInvoice.unitPriceOfAnItem(thirdPrice);
        shopInvoice.setDiscount(2);
        shopInvoice.vatValue();
        assertEquals(323.75, shopInvoice.getVATValue());
    }

    @Test
    void amountOfMoneyCustomerPaid(){
        int money = 200;
        shopInvoice.calculateBalanceFromAmountCustomerPaid(money);
        assertEquals(200, shopInvoice.getAmountCustomerPaid());
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
        shopInvoice.addNewItem(nameOfItemPurchased);
        shopInvoice.addNewItem(secondNameOfItemPurchased);
        shopInvoice.addNewItem(thirdNameOfItemPurchased);
        shopInvoice.numberOfItemInCart(numberOfItems);
        shopInvoice.numberOfItemInCart(numberOfSecondItems);
        shopInvoice.numberOfItemInCart(numberOfThirdItems);
        shopInvoice.unitPriceOfAnItem(price);
        shopInvoice.unitPriceOfAnItem(secondPrice);
        shopInvoice.unitPriceOfAnItem(thirdPrice);
        shopInvoice.setDiscount(2);
        shopInvoice.vatValue();
        assertEquals(2136.75, shopInvoice.getTotalBill());
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
        shopInvoice.addNewItem(nameOfItemPurchased);
        shopInvoice.addNewItem(secondNameOfItemPurchased);
        shopInvoice.addNewItem(thirdNameOfItemPurchased);
        shopInvoice.numberOfItemInCart(numberOfItems);
        shopInvoice.numberOfItemInCart(numberOfSecondItems);
        shopInvoice.numberOfItemInCart(numberOfThirdItems);
        shopInvoice.unitPriceOfAnItem(price);
        shopInvoice.unitPriceOfAnItem(secondPrice);
        shopInvoice.unitPriceOfAnItem(thirdPrice);
        shopInvoice.setDiscount(2);
        shopInvoice.vatValue();
        shopInvoice.getTotalBill();
        shopInvoice.calculateBalanceFromAmountCustomerPaid(amountCustomerPaid);
        assertEquals(63.25, shopInvoice.getBalance());
    }
}