package Shop;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		String marketLocation = "Istanbul";
		Market market = new Market(marketLocation);

		MilkProduct milkProduct = new MilkProduct("Milk", 2.5, 50, "20.12.2023", marketLocation);
		MeatProduct meatProduct = new MeatProduct("Beef", 12.0, 30, "15.11.2023", marketLocation);
		GlutenFreeProduct glutenFreeProduct = new GlutenFreeProduct("Gluten-Free Bread", 4.0, 20,
				"12.12.2023", marketLocation);

		market.addProduct(milkProduct);
		market.addProduct(meatProduct);
		market.addProduct(glutenFreeProduct);

		System.out.println("\nProducts: ");
		List<Product> productList = market.listProducts();
		for (Product product : productList) {
			System.out.println(product);
		}
	}
}
