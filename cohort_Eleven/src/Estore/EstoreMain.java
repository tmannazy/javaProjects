package Estore;

public class EstoreMain {
    public static void main(String... args) {
        int quantity = 500;
        Items items = new Items(quantity);
        items.manageProduct(new Product(),12, "Golang",6000,"Programming Language");
        System.out.println(items);
    }
}
