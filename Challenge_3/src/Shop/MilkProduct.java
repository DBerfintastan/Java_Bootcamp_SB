package Shop;

public class MilkProduct extends Product {
	public MilkProduct(String name, double price, int stock, String expirationDate, String location) {
        super(name, price, stock, expirationDate, location);
        System.out.println("Added milk product "+ "-" +name+"-");
	
	}
}
