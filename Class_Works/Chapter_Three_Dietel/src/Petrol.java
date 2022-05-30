public class Petrol {
	public static void main(String... args) {
		PetrolPurchase petrol = new PetrolPurchase("Onitsha","fuel",500.75,
				50, 50);
		System.out.printf("The petrol station location is %s, Tman bought %s of %d liters for his Benz G-wagon " +
						"for a price per liters at %.1f, with discounted price of %.0f%n",
				petrol.getStationLocation(), petrol.getPetrolType(), petrol.getQuantityPurchase(),
				petrol.getPricePerLitre(), petrol.getPurchaseAmount());
	}
}
	
	
	
