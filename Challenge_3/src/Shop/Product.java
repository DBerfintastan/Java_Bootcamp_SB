package Shop;

public class Product extends Market{
	
	private String name;
    private double price;
    private int stock;
    private String expirationDate;

    public Product(String name, double price, int stock, String expirationDate, String location) {
        super(location);
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Product Name: " + name + "\n" +
                "Price: " + price + "\n" +
                "Stock: " + stock + "\n" +
                "Expiration Date: " + expirationDate + "\n" +
                "Market Location: " + getLocation() + "\n";
        		
    }
}
