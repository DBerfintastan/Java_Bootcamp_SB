package Shop;

import java.util.ArrayList;
import java.util.List;

public class Market {
	 private String location;
	    private List<Product> products = new ArrayList<>();

	    public Market(String location) {
	        this.location = location;
	    }

	    public String getLocation() {
	        return location;
	    }

	    public void setLocation(String location) {
	        this.location = location;
	    }

	    public void addProduct(Product product) {
	        products.add(product);
	    }

	    public void removeProduct(String productName) {
	        for (int i = 0; i < products.size(); i++) {
	            if (products.get(i).getName().equals(productName)) {
	                products.remove(i);
	                i--; // Decrement index when the list size changes
	            }
	        }
	    }

	    public List<Product> listProducts() {
	        return products;
	    }

}
