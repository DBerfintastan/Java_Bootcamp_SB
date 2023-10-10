package Shop;

public class GlutenFreeProduct extends Product {
	public GlutenFreeProduct(String name, double price, int stock, String expirationDate, String location) {
        super(name, price, stock, expirationDate, location);
        System.out.println("Added gluten free product "+ "-" +name+"-");
    }
}