public class SalesCommissionCalculator {
    //    Question 4.19
    private int itemNum;
    private double itemValue;

    public SalesCommissionCalculator(int itemNum, double itemValue) {
        this.itemNum = itemNum;
        this.itemValue = itemValue;
    }

    public void setItemSold(int itemNum, double itemValue) {
        this.itemNum = itemNum;
        this.itemValue += itemValue;
    }
    public double getItemValue() {
        return itemValue;
    }

    public int getItemNum() {
        return itemNum;
    }

    public double commission() {
        double interestOnSales = 0.09;
        int commissionPrice = 200;
        return (getItemValue() * interestOnSales) + commissionPrice;
    }
}
