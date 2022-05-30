public class SalesCommissionCalculatorTest {
    public static void main(String... args) {
        SalesCommissionCalculator sales = new SalesCommissionCalculator(1, 239.99);
        sales.setItemSold(2, 129.75);
        sales.setItemSold(3, 99.95);
        sales.setItemSold(4, 350.89);
        System.out.format("Your commission for last week sales is %.2f", sales.commission());
    }
}
