package Estore;

public class Product {
    ProductCategory productCategory;
    private int productID;
    private String productName;
    private double price;
    private String productDescription;

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String toString() {
        return ("Product name: " + getProductName() + " Price: " + getPrice() +
                " with ProductID: " + getProductID() + " in Description " + getProductDescription());
    }

}
