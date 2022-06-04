package Estore;

public class Items {
    Product product;
    private int productQuantity;

    Items(int productQuantity) {
        setProductQuantity(productQuantity);
    }

    public void manageProduct(Product product, int productID, String productName, int price, String productDescription) {
        product.setProductID(productID);
        product.setProductName(productName);
        product.setPrice(price);
        product.setProductDescription(productDescription);
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) { this.productQuantity = productQuantity; }

    public String toString() { return ("Product quantity is: " + getProductQuantity()); }

}
