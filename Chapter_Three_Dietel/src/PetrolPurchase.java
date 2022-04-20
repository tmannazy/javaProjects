
public class PetrolPurchase {
    private String stationLocation, petrolType;
    private double pricePerLitre, percentageDiscount;
    private int quantityPurchase;

    
public PetrolPurchase(String stationLocation,
                      String petrolType,
                      double pricePerLitre,
                      double percentageDiscount,
                      int quantityPurchase) {
    this.stationLocation = stationLocation;
    this.petrolType = petrolType;
    this.pricePerLitre = pricePerLitre;
    this.percentageDiscount = percentageDiscount / 100;
    this.quantityPurchase = quantityPurchase;
}

    public void setStationLocation (String stationLocation)
    {
        this.stationLocation = stationLocation;
    }

    public void setPetrolType(String petrolType)
    {
        this.petrolType = petrolType;
    }

    public void setPricePerLitre(double pricePerLitre)
    {
        this.pricePerLitre = pricePerLitre;
    }

    public void setPercentageDiscount(double percentageDiscount)
    {
    	this.percentageDiscount = percentageDiscount;
    }
    	
    public void setQuantityPurchase(int quantityPurchase)
    {
        this.quantityPurchase = quantityPurchase;
    }
    
    public String getStationLocation()
    {
        return stationLocation;
    }

    public String getPetrolType()
    {
        return petrolType;
    }

    public double getPricePerLitre() {
        return pricePerLitre;
    }



    public double getPercentageDiscount()
    {
        return percentageDiscount;
    }
    
    public int getQuantityPurchase()
    {
        return quantityPurchase;
    }

    public double getPurchaseAmount() {
        double purchaseAmount = pricePerLitre * quantityPurchase;
        double discountOfPurchase = purchaseAmount * percentageDiscount;
        return purchaseAmount - discountOfPurchase;
    }
}


