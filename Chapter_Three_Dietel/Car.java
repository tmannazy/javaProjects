public class Car {
    private String model;
    private String year;
    private double price;

    public Car(String model, String year, double price) {
        this.model = model;
        this.year = year;
        if(price > 0.0)
            this.price = price;
    }

    public void calculateDiscount(double discount) {
        if(price > 0.0)
            price =  price * (discount / 100);
    }

    public void setModel(String nameOfCarModel) {
        this.model = nameOfCarModel;
    }

    public String getModel() {
        return model;
    }

    public void setYear(String yearOfManufacture) {
        this.year = yearOfManufacture;
    }

    public String getYear() {
        return year;
    }

    public void setPrice(double priceOfCar) {
        if(priceOfCar > 0.0) {
            this.price = priceOfCar;
        }
    }

    public double getPrice() {
        return price;
    }
}
