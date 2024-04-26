package Activity4;

import java.util.ArrayList;
import java.util.Iterator;

public class Store {
	private ArrayList<Product> products;
	
	public Store() {
	    this.products = new ArrayList<>();
	}
	
	public void addProduct(Product product) {
		this.products.add(product);
	}
	
	public void removeFirstProduct(Product product) {
		for (Product p : this.products) {
			if (p == product) {
				this.products.remove(product);
				break;
			}
		}
	}
	
	public void listProducts() {
	    String productsString = "";
	    for(Product p : this.products) {
			productsString += p.name + "\n";
		}
	    System.out.println(productsString); // Print or return the result
	}
}
