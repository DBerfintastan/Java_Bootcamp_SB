package Shop;

public class MeatProduct extends Product {
	public MeatProduct(String name, double price, int stock, String expirationDate, String location) {
        super(name, price, stock, expirationDate, location);
        System.out.println("Added meat product "+ "-" +name+"-");
	}
}